package com.helloService.helloService.service;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String getHello() {
        return "Hello";
    }
}
