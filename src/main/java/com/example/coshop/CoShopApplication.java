package com.example.coshop;

import com.example.coshop.annotation.EnableLogging;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

/* 단순 Bycrpt를 위해 Security를 사용 했으 므로 Security 기능 OFF*/
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@EnableLogging
public class CoShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoShopApplication.class, args);
    }

}
