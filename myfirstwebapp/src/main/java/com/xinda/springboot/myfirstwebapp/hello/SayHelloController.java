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
}
