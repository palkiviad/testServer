package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by �������� on 01.06.2015.
 */
public class WelcomeServlet extends MyCustomServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("HELLo WORLD!");
    }

    @Override
    public String getPath() {
        return "/*";
    }
}
