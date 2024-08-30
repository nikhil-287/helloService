package com.helloService.helloService.controller;

import com.helloService.helloService.service.HelloService;
import com.helloService.helloService.service.HelloServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Slf4j
@RestController
public class HelloController {

    @Autowired
    HelloServiceImpl helloService;

    @GetMapping("/hello")
    public String getHello() {
        return helloService.getHello();
    }

}