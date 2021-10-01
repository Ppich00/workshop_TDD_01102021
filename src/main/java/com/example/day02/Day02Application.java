package com.example.day02;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@Slf4j
@SpringBootApplication
public class Day02Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(Day02Application.class, args);
        log.info(String.valueOf(context.getBeanDefinitionCount()));
    }

}
