package controller;

import dao.UserDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.portlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
/**
 * Created by parkjihyoung on 15. 5. 1..
 */
@Controller
@SessionAttributes(types = vo.User.class)
public class UserController {

    @Resource(name = "userDao")
    private UserDao userDao;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response){

        //final List<User> users = new ArrayList<User>();

        /*
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("cnt", userDao.cntUsers());
        */

        return new ModelAndView("userCnt", "cnt", userDao.cntUsers());
    }
}
