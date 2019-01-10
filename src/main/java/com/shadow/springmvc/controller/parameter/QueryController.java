package com.shadow.springmvc.controller.parameter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 接收路径上的参数
 * 例如：?userName=yqp&phone=182
 * Created by shadow on 17/4/10.
 */
@Controller
@RequestMapping(value = "query")
public class QueryController {

    /**
     * 必填参数
     *
     * @param userName
     * @param phone
     */
    @RequestMapping("query1")
    @ResponseBody
    public Object query(@RequestParam("userName") String userName, @RequestParam("phone") int phone) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("userName", userName);
        result.put("phone", phone);
        return result;
    }

    /**
     * 设置默认值
     *
     * @param userName
     * @param phone
     */
    @RequestMapping("query2")
    @ResponseBody
    public Object query2(@RequestParam("userName") String userName, @RequestParam(value = "phone", defaultValue = "10") int phone) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("userName", userName);
        result.put("phone", phone);
        return result;
    }

    /**
     * 非必填参数
     * 如果用@RequestMapping注解的参数是int基本类型，但是required=false，这时如果不传参数值会报错，因为不传值，会赋值为null给int，这个不可以
     * 解决方法：
     * “Consider declaring it as object wrapper for the corresponding primitive type.”建议使用包装类型代替基本类型，如使用“Integer”代替“int”
     *
     * @param userName
     * @param phone
     */
    @RequestMapping("query3")
    @ResponseBody
    public Object query3(@RequestParam("userName") String userName, @RequestParam(value = "phone", required = false) int phone) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("userName", userName);
        result.put("phone", phone);
        return result;
    }

    /**
     * 非必填参数
     * 如果用@RequestMapping注解的参数是int基本类型，但是required=false，这时如果不传参数值会报错，因为不传值，会赋值为null给int，这个不可以
     * 解决方法：
     * “Consider declaring it as object wrapper for the corresponding primitive type.”建议使用包装类型代替基本类型，如使用“Integer”代替“int”
     *
     * @param userName
     * @param phone
     */
    @RequestMapping("query4")
    @ResponseBody
    public Object query4(@RequestParam("userName") String userName, @RequestParam(value = "phone", required = false) Integer phone) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("userName", userName);
        result.put("phone", phone);
        return result;
    }
}
