package com.ruantong.springboottest001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.ruantong.springboottest001.dao"})
public class Springboottest001Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboottest001Application.class, args);
    }
}
