package com.wangkai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * 页面控制器
 */
@Controller
public class PageController {

    @RequestMapping(value = "/indexed", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView pageGet() {
        return new ModelAndView("/admin/index");
    }

    @RequestMapping(value = "/login", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView loginIn() {
        return new ModelAndView("/admin/login");
    }
}
