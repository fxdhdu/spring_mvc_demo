package test;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by fxd on 2018/9/2.
 */
public class UserController extends AbstractController {

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest,
                                                 HttpServletResponse httpServletResponse) throws Exception {
        List<User> userList = new ArrayList<User>();
        User userA = new User("zhangshan", 27);
        User userB = new User("lisi", 29);
        userList.add(userA);
        userList.add(userB);
        return new ModelAndView("userlist", "users", userList);
    }
}
