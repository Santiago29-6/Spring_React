package com.ks.codigo;

import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
public class HelloWorldAPI {

    @Autowired
    private HelloWordRepository repository;

    @GetMapping("/hello/{name}/{age}")    
    public String hello(@PathVariable String name,@PathVariable Integer age){
        String welcomeMsg = "Welcome: " + name + ", Age: " + age + " : " + LocalDateTime.now();
        HelloEntity helloWord = new HelloEntity();
        helloWord.setMsj(welcomeMsg);
        repository.save(helloWord);
        return welcomeMsg;
    }
}
