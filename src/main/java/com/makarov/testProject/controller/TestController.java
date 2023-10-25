package com.makarov.testProject.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public void test() {
        System.out.println("get");
    }
    @PostMapping
    public void testPost(){
        System.out.println("test post");
    }

}
