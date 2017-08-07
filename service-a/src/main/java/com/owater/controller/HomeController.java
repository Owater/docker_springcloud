package com.owater.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Owater on 2017/8/3.
 */
@RestController
public class HomeController {

    @Value("${server.port}")
    String port;

    @GetMapping("hi")
    @HystrixCommand
    public String index(@RequestParam String name) {
        return "hi "+name+", port:" +port;
    }

    public String hiError(String name) {
        return "hi,"+name+",error lalalala!";
    }
}
