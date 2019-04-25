package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.config.ShiroConfig;

@SpringBootApplication
@SpringBootTest(classes = ShiroConfig.class)
@MapperScan("com.example.demo.dao")  
public class Demo3Configuration {
}
