package com.foxrider.helloworld;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.foxrider.helloworld.model.HelloResponse;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Slf4j
public class HelloWorldApplication {
    private final ObjectMapper mapper;

    @Autowired
    public HelloWorldApplication(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    public static void main(String[] args) {
        log.info("{}, {}", "Hello World", "0.0.3");
        SpringApplication.run(HelloWorldApplication.class, args);
    }


    @GetMapping("/hello")
    public String helloWorld() throws JsonProcessingException {
        return mapper.writeValueAsString(new HelloResponse("Hello World", "0.0.3"));
    }
}
