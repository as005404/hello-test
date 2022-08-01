package com.foxrider.helloworld;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {
    @Bean
    public ObjectMapper mapper(){
        return new ObjectMapper();
    }
}
