package com.springboot.springtest9;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.springboot.springtest9.dao")
public class SpringTest9Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringTest9Application.class, args);
    }

}
