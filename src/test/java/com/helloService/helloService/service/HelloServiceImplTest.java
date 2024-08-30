package com.helloService.helloService.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class HelloServiceImplTest {

    @Autowired
    HelloServiceImpl helloService;

    @Test
    public void getHelloTest() {
        assertEquals("Hello", helloService.getHello());
    }
}