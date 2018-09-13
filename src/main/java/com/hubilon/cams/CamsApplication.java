package com.hubilon.cams;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@MapperScan(basePackages = "com.hubilon.cams.mapper")
public class CamsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CamsApplication.class, args);
    }
}
