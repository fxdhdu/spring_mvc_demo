package test;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 *
 * Created by fxd on 2018/9/2.
 */
public class MyDataContextListener implements ServletContextListener {

    private ServletContext context = null;

    public MyDataContextListener() {


    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        this.context = sce.getServletContext();

        context.setAttribute("myData", "this is myData");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        this.context = null;
    }
}
