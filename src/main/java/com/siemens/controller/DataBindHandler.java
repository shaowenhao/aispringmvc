package com.siemens.controller;

import com.siemens.entity.User;
import com.siemens.entity.UserList;
import com.siemens.entity.UserMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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


    /**
     * 访问http://localhost:8080/addMap.jsp 输入 id,name 提交
     * 切换成  http://localhost:8080/data/map User(id=123, name=dd, address=null)
     * @param userMap
     * @return
     */
    @RequestMapping("/map")
    public String map(UserMap userMap){
        StringBuffer str = new StringBuffer();
        for (String key: userMap.getUsers().keySet()){
            User user = userMap.getUsers().get(key);
            str.append(user);
        }
        return str.toString();
    }


    @RequestMapping("/json")
    public User json(@RequestBody User user){
        System.out.println(user);
        return user;
    }
}
