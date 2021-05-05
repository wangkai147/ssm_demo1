package com.wangkai.controller;

import com.wangkai.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * 页面控制器
 */
@Controller
@RequestMapping(value = "/page")
public class PageController {

    @RequestMapping(value = "/index", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView pageGet() {
        return new ModelAndView("/admin/index");
    }

    @RequestMapping(value = "/login", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView loginIn() {
        return new ModelAndView("/admin/login");
    }
    @RequestMapping(value = "/statistics", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView statistics() {
        return new ModelAndView("/admin/welcome1");
    }
    @RequestMapping(value = "/member-list", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView member_list() {
        return new ModelAndView("/admin/member-list");
    }

    @RequestMapping(value = "/loginout", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView loginOut(HttpServletRequest request) {
        Enumeration em = request.getSession().getAttributeNames();
        while(em.hasMoreElements()){
            request.getSession().removeAttribute(em.nextElement().toString());
        }
        return new ModelAndView("/admin/login");
    }
}
