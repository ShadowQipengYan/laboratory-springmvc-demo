package com.shadow.springmvc.controller.json;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by shadow on 17/4/10.
 */
@Controller
@RequestMapping("json")
public class JsonController {

    /**
     * 返回一个json
     */
    @RequestMapping(value = "json")
    @ResponseBody
    public Object returnJson(){
        Map<String, Object> result = new HashMap<String,Object>();
        result.put("name", "jack");
        result.put("age", 18);
        return  result;
    }

}
