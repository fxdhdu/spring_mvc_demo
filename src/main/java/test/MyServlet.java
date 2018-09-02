package test;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by fxd on 2018/9/2.
 */
public class MyServlet extends HttpServlet {
    @Override
    public void init() {
        System.out.println("this is init method");
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        handleLogic(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        handleLogic(req, resp);
    }

    private void handleLogic(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("handle myLogic");

        ServletContext sc = getServletContext();

        RequestDispatcher rd = null;

        rd = sc.getRequestDispatcher("/index.jsp");

        try {
            rd.forward(request, response);

        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
