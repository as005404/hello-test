package com.foxrider.helloworld;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.foxrider.helloworld.model.HelloResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldApplication {

    private final ObjectMapper mapper;

    @Autowired
    public HelloWorldApplication(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }


    @GetMapping("/hello")
    public String helloWorld() throws JsonProcessingException {
        return mapper.writeValueAsString(new HelloResponse("Hello World", "0.0.1"));
    }
}
