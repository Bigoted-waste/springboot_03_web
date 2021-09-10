package com.cola;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cola.dao")
public class Springboot03WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot03WebApplication.class, args);
    }

}
