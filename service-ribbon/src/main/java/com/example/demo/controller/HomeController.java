package com.example.demo.controller;

import com.example.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Owater on 2017/8/3.
 */
@RestController
public class HomeController {

    @Autowired
    HelloService helloService;

    @GetMapping("hi")
    public String index(@RequestParam String name) {
        return helloService.hiService(name);
    }
}
