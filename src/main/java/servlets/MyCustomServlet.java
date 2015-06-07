package servlets;

import javax.servlet.http.HttpServlet;

/**
 * Created by Алкивиад on 01.06.2015.
 */
public abstract class MyCustomServlet extends HttpServlet {

    public abstract String getPath(); 
}
