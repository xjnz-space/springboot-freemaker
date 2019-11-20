package com.qg.sbfreemaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.qg.sbfreemaker.*")
@SpringBootApplication
public class SpringbootFreemakerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootFreemakerApplication.class, args);
    }

}
