package com.wangkai.controller;

import com.wangkai.pojo.User;
import com.wangkai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


/*
 * springmvc前后端的传值方式：
 * 1.将请求参数名作为controller中方法的形参
 *
 *
 * 2.使用@RequsetParam绑定请求参数值
 *  -- 如果获取参数为Long,可以使用此注解
 *  public String getUserService(@RequestParam("id") Long id){}
 * `原理：String id = request.getParameter("id");
 *       Long id = Long.parseLong(id);
 * 3.使用@SessionAttribute获取session中的内容
 *  public String getUserService(@SessionAttribute("id") Long id){}
 *
 * 4.POJO作为参数
 *  框架会利用反射寻找对应字段
 *
 * 5.使用原生ServletApi获取
 * （HttpSession session, HttpServletRequest request）
 * -- 不建议使用，原因：控制器会依赖于Servlet容器
 * */


@Controller
public class UserController {
    @Autowired
    private UserService userService;

//    private final UserService userService;
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }

    @RequestMapping(value = "/selectUser", method = RequestMethod.GET)
    public ModelAndView getUserService(@RequestParam("id") int id, Model model) {

        User user = userService.getUserById(id);
        ModelAndView modelAndView = new ModelAndView();
        if (user != null) {
            modelAndView.setViewName("showUser");
            model.addAttribute("msg", user);
            return modelAndView;
        }
        modelAndView.setViewName("selectUser");
        model.addAttribute("msg", "id:" + id + "对应的user不存在");
        return modelAndView;
    }
}
