package com.makarov.testProject.controller;

import org.springframework.web.bind.annotation.*;

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
    @DeleteMapping
    public void deleteById(){
        System.out.println("Deleted");
    }

    @PutMapping
    public void put(){
        System.out.println("put");
    }
}
