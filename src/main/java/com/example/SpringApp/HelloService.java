package com.example.SpringApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloService {
    @RequestMapping("/")
    public String index(){
        return ("Hello ma niggg");
    }

    @RequestMapping("/profile")
    public String profile(){
        return ("Profile");
    }
}
