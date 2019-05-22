package com.sdsoon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableDubboConfiguration
//@ComponentScan("com.sdsoon.demo.*")
public class ProDubboApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProDubboApplication.class, args);
    }

}
