package com.westminster.class_practice.demo.productapi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

    @GetMapping("/getAddress/{city}")
    public String getAddress(@PathVariable  String city){
        Address address = new Address(
                1,
                "Mony",
                "Lalitpur",
                "kupondole",
                "Nepal");
        return address.getFullAddress();


    }

    @GetMapping("/getperson")
    public String getPerson() {
        Person person = new Person(
                1,
                "Mony",
                "2004");

        return  person.getAge();
    }

}
