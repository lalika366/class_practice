package com.westminster.class_practice.demo.productapi;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/Products")
public class Productcontroller{
    @GetMapping("/{id}")
    public Product getById(@PathVariable int id){
        return new Product(
                id,
                name:"suzi",
                qty: 10,
                inStock: ,
                price: 30
        );

    }
}

