##Spring MVC 数据绑定
数据绑定：在后端业务方法中直接获取客户端HTTP请求的参数，将请求参数
映射到业务方法的形参中，数据绑定的工作由HandlerAdapter来完成

* 基本数据类型
````
   @RequestMapping("/baseType")
    @ResponseBody
    public String baseType(int id){
        return id+"";
    }
@ResponseBody 表示Spring MVC会直接将业务方法的返回值响应给客户端
如果不加该注解，Spring MVC会将业务方法传递给DispatcherServlet,再
由DispatcherServlet调用ViewResolver对返回值进行解析。映射到一个
JSP资源。
````

* 包装类
````
    @RequestMapping("/packgeType")
    @ResponseBody
    public String packageType(Integer id){
        return id+"";
    }
可以接收null 当HTTP请求没有参数时候，使用包装类来定义形参的数据
类型不会抛异常。
````