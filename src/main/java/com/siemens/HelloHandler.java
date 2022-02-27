package com.siemens;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

}
