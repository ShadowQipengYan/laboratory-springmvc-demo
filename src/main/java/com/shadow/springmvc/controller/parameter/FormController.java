package com.shadow.springmvc.controller.parameter;

import com.shadow.springmvc.model.user.UserVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;


/**
 * Created by shadow on 17/4/10.
 */
@Controller
@RequestMapping(value = "form")
public class FormController {

    /**
     * 跳转到注册页面
     *
     * @return
     */
    @RequestMapping(value = "register", method = RequestMethod.GET)
    public String showRegisterForm() {
        return "register";
    }

    /**
     * 处理Form表单提交过来的注册数据
     * 对USerVO的值进行校验
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "register", method = RequestMethod.POST)
    public String processRegistration(@Valid UserVO user, BindingResult errors) {
        if (errors.hasErrors()) {
            return "register";
        }
        return "redirect:/form/" + user.getUserName();//重定向
    }

    /**
     * 获取用户信息
     *
     * @param userName
     * @param model
     * @return
     */
    @RequestMapping(value = "/{userName}", method = RequestMethod.GET)
    public String showUserProfile(@PathVariable(value = "userName") String userName, Model model) {
        //模拟通过username获取用户信息
        model.addAttribute("userName", userName);
        model.addAttribute("pwd", "18259121409");
        return "profile";
    }
}
