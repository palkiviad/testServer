package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;

/**
 * Created by Алкивиад on 01.06.2015.
 */
public class WelcomeServlet extends MyCustomServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("HELLo WORLD!");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String partsValue = "";
        for (Part part :req.getParts()) {
            partsValue += part.getName();
        }
        resp.getWriter().println("it's a response from post "+  partsValue);
    }

    @Override
    public String getPath() {
        return "/*";
    }
}
