package com.shadow.springmvc.controller.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by shadow on 17/4/8.
 */
@Controller
@RequestMapping(value = {"/","/home"})
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public String home(){
        return "home";
    }
}
