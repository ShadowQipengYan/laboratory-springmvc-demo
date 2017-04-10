package com.shadow.springmvc.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by shadow on 17/4/10.
 */
@Controller
@RequestMapping(value = "/view")
public class ViewController {

    /**
     * 返回页面
     * @param model
     * @return
     */
    @RequestMapping(value = "/view")
    public String view(Model model){
        model.addAttribute("key", "Attribute View");
        return "view";
    }

}
