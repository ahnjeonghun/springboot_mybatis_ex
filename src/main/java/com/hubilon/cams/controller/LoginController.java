package com.hubilon.cams.controller;

import com.hubilon.cams.app.exception.BusinessRuleViolationException;
import com.hubilon.cams.app.exceptionHandler.CamsExceptionHandler;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class LoginController {
    @Value("${target}")
    private String target;

    @RequestMapping(value = "/login", method= RequestMethod.GET)
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView();
        return  modelAndView;
    }

    @RequestMapping(value = "/loginAction", method= RequestMethod.POST)
    public ModelAndView loginAction(
            HttpServletRequest request,
            ServletResponse response,
            HttpSession session,
            @RequestParam(value="id", required = true, defaultValue = "")  String id,
            @RequestParam(value="pass", required = true, defaultValue = "")  String pass){
        ModelAndView modelAndView = new ModelAndView();

        String clientIp = request.getRemoteAddr();
        System.out.println(request.getRemotePort());
        if(pass.equals("")){
            System.out.println("ss");
        }
        if(id.equals("admin") && pass.equals("1234")){
            session.setAttribute("id" , id);
            session.setAttribute("name" , "관리자");

            modelAndView.setViewName("redirect:/");
        }else{
           throw new BusinessRuleViolationException("로그인실패");
        }

        return  modelAndView;
    }

}
