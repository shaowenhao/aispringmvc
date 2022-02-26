package com.siemens;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description:
 * date: 2022 2022/2/26 19:24
 *
 * @author shaowenhao
 * @since JDK 1.8
 */

@Controller
public class HelloHandler {

    @RequestMapping("/index")
    public String index(){
        System.out.println("execute index...");
        return "index";
    }
}
