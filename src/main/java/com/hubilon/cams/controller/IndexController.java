package com.hubilon.cams.controller;

import com.hubilon.cams.entity.Test;
import com.hubilon.cams.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class IndexController {
    @Autowired
    private TestService testService;
    @RequestMapping("/tests")
    @ResponseBody
    public List<Test> findtests() {
        return testService.findAll();
    }

    @RequestMapping("/")
    public ModelAndView index(HttpSession session){
        ModelAndView modelAndView = new ModelAndView();

        if( session != null){
            modelAndView.addObject("id",session.getAttribute("id"));
            modelAndView.addObject("name",session.getAttribute("name"));
        }

        modelAndView.setViewName("index");
        return modelAndView;
    }
}
