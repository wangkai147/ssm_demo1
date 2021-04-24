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
    /*
     * springmvc是使用自定义方法来处理请求的
     */


    @Autowired
    private UserService userService;

    /**
     * RequestMapping : 请求映射 -- 把请求地址和方法绑定
     * value -- url地址
     * method -- 请求方式
     *
     * ModelAndView
     */
    @RequestMapping(value = "/selectUser", method = RequestMethod.GET)
    public ModelAndView getUserService(@RequestParam("username") String username, @RequestParam("password") String password, Model model) {
//        model.addAttribute("msg", "登录失败");
        //指定视图 -- 框架执行redirect重定向操作
        User user = userService.getUserByName(username);
        ModelAndView modelAndView = new ModelAndView();
        if (user != null) {
            modelAndView.setViewName("showUser");
            model.addAttribute("msg", user);
            return modelAndView;
        }
        modelAndView.setViewName("selectUser");
        model.addAttribute("msg", "用户不存在");
        return modelAndView;
    }

    /*
     * 返回接口给客户端
     * */
    @RequestMapping(value = "/selectUserClient", method = RequestMethod.GET)
    //作用1：将java转为json格式
    //在使用此注解之后不会再走视图处理器，而是直接将数据写入到输入流中，他的效果等同于通过response对象输出指定格式的数据
    //该方法的返回结果直接写入 HTTP response body 中，一般在异步获取数据时使用【也就是AJAX】
    //作用2：@RequestBody是作用在形参列表上，用于将前台发送过来固定格式的数据【xml格式 或者 json等】封装为对应的 JavaBean 对象，
    //封装时使用到的一个对象是系统默认配置的 HttpMessageConverter进行解析，然后封装到形参上。
    @ResponseBody
    private User getUserServiceFormClient(@RequestParam("id") int id) {
        return userService.getUserById(id);
    }
}
