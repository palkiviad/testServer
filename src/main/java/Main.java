import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import servlets.MyCustomServlet;
import servlets.ServletsContainer;

import javax.servlet.MultipartConfigElement;


public class Main {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        ServletContextHandler handler = new ServletContextHandler(ServletContextHandler.SESSIONS);
        for (MyCustomServlet servlet : ServletsContainer.getList()) {
            ServletHolder holder = new ServletHolder(servlet);
            holder.getRegistration().setMultipartConfig(new MultipartConfigElement(""));
            handler.addServlet(holder, servlet.getPath());
        }

        server.setHandler(handler);
        server.start();
        server.join();
    }
}
