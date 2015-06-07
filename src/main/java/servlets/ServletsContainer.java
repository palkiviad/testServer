package servlets;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Алкивиад on 01.06.2015.
 */
public class ServletsContainer {
    private static List<MyCustomServlet> list = new ArrayList<MyCustomServlet>();


    public static List<MyCustomServlet> getList() {
        if (list.isEmpty()) {
            initialize();
        }
        return list;
    }

    private static void initialize() {
        list.add(new WelcomeServlet());
        list.add(new IndexServlet());

    }
}
