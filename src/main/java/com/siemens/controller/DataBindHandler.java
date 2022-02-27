package com.siemens.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Description:
 * date: 2022 2022/2/27 21:29
 *
 * @ResponseBody 表示Spring MVC会直接将业务方法的返回值响应给客户端
 * @author shaowenhao
 * @since JDK 1.8
 */

@Controller
@RequestMapping("/data")
public class DataBindHandler {

    @RequestMapping("/baseType")
    @ResponseBody
    public String baseType(int id){
        return id+"";
    }

    @RequestMapping("/packgeType")
    @ResponseBody
    public String packageType(Integer id){
        return id+"";
    }
}
