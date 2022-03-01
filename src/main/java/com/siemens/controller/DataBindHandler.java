package com.siemens.controller;

import com.siemens.entity.User;
import com.siemens.entity.UserList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * Description:
 * date: 2022 2022/2/27 21:29
 *
 * @ResponseBody 表示Spring MVC会直接将业务方法的返回值响应给客户端
 * @author shaowenhao
 * @since JDK 1.8
 */

@RestController
@RequestMapping("/data")
public class DataBindHandler {

    @RequestMapping("/baseType")
  //  @ResponseBody
    public String baseType(int id){
        return id+"";
    }

    @RequestMapping("/packgeType")
  //  @ResponseBody
    //表示请求里的num 赋给 形参id，否则请求的参数也得是id
    //http://localhost:8080/data/packgeType?num=7
    public String packageType(@RequestParam(value = "num") Integer id){
        return id+"";
    }


    @RequestMapping("/list")
    public String list(UserList userList, HttpServletResponse httpServletResponse){
        httpServletResponse.setContentType("text/json;charset=UTF-8");
          StringBuffer str = new StringBuffer();
          for (User user: userList.getUsers()){
              str.append(user);
          }
          return str.toString();
    }
}
