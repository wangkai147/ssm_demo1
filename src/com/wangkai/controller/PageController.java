package com.wangkai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping(value = "/loginPage", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView loginIn() {
        return new ModelAndView("/admin/login");
    }
}
