package com.polpid.account.controller;

import com.polpid.account.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;


@Controller
public class SigninController {

    @RequestMapping(value="/signin", method = RequestMethod.GET)
    public ModelAndView showSigninPage(ModelAndView modelAndView, User user){
        modelAndView.addObject("user", user);
        modelAndView.setViewName("signin");
        return modelAndView;
    }

    @RequestMapping(value="/signin", method = RequestMethod.POST)
    public ModelAndView sigin(ModelAndView modelAndView, @Valid User user, BindingResult bindingResult, HttpServletRequest request){

        modelAndView.addObject("user", user);
        modelAndView.setViewName("home");

        return modelAndView;
    }
}
