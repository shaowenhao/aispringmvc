package com.siemens.controller;

import com.siemens.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.xml.transform.Source;

/**
 * Description:
 * date: 2022 2022/2/26 19:24
 *
 * @author shaowenhao
 * @since JDK 1.8
 *
 *
 * 1.客户端访问http://localhost:8080/index
 * 2. DispatcherServlet捕获
 * 3. HandlerMapping返回 HandlerExecutionChain @RequestMappping
 *
 * SPing MVC注解
 *
 * @RequestMapping 将URL请求与也业务方法进行映射，在类定义处添加，相当访问多了一层路径
 * @Controller 在类定义处添加，将该类交给IOC容器来管理(结合springmvc.xml的自动扫描)，
 * 同时使其成为一个控制器，可以接收客户端请求
 *
 */

@Controller
@RequestMapping("hello")
public class HelloHandler {

    //http://localhost:8080/hello/index?name=shaowenhao&id=1
    @RequestMapping(value = "/index", method = RequestMethod.GET,params = {"name","id"})

    //可以在参数加 @RequestParam("name") String str 表示不用一样的名字可以自己定义 建立映射关系
     public String index(String name,int id){
        System.out.println(name);
        System.out.println(id);
        System.out.println("execute index...");
        return "index";
    }

    //不会自动绑定，需要手动绑定 用的是@PathVariable
    //http://localhost:8080/hello/rest/shaowenhao/20
    @RequestMapping("/rest/{name}/{id}")
    public String rest(@PathVariable("name") String name,@PathVariable("id") int id){
        System.out.println(name);
        System.out.println(id);
        return "index";
    }

    //Spring MVC会根据请求参数名和JavaBean属性名进行自动匹配，自动为对象填充属性，同时
    //级联属性
    //访问 http://localhost:8080/register.jsp 提交表单跳转到hello world,终端打印 User(id=11, name=wenshao)
   //添加Address到User User(id=12, name=xiaodan, address=Address(value=fengtai))
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(User user){
        System.out.println(user);
        return "index";
    }
}
