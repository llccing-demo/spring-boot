package com.xinda.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

    // say-hello => "hi, what are you learn today?"
    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello() {
        return "hi, what are you learn today?";
    }

    @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHtml() {
        StringBuffer sb = new StringBuffer();
        sb.append("<html lang=\"en\">");
        sb.append("<head>");
        sb.append("<meta charset=\"UTF-8\">");
        sb.append("<title>Title</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("body...");
        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();
    }

    /**
     * sayHello.jsp
     * welcome.jsp
     * login.jsp
     * todos.jsp
     * @return
     */
    @RequestMapping("say-hello-jsp")
    public String sayHelloJsp() {
        return "sayHello";
    }
}
