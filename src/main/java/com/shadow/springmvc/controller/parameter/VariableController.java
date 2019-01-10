package com.shadow.springmvc.controller.parameter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 路径上参数传递
 * 通常在面向资源的时候使用
 * Created by shadow on 17/4/10.
 */
@Controller
@RequestMapping(value = "variable")
public class VariableController {


    @RequestMapping(value = "/variable/{resource}")
    @ResponseBody
    public Object variable(@PathVariable("resource") String resource) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("resource", resource);
        return result;
    }

}
