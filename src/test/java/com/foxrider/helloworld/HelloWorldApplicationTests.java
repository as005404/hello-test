package com.foxrider.helloworld;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.foxrider.helloworld.model.HelloResponse;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class HelloWorldApplicationTests {
    private final ObjectMapper mapper = new ObjectMapper();

    HelloWorldApplication application = new HelloWorldApplication(mapper);

    @Test
    void contextLoads() throws JsonProcessingException {
        HelloResponse helloResponse = mapper.readValue(application.helloWorld(), HelloResponse.class);
        assertEquals("Hello World", helloResponse.getMessage());
    }

}
