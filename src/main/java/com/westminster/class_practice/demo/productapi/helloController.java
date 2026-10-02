package com.westminster.class_practice.demo.productapi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

    @GetMapping("/api/product")
    public String hello(){
        return "hello world";


//        oop code
//        Product product = new Product(int)
    }
}
