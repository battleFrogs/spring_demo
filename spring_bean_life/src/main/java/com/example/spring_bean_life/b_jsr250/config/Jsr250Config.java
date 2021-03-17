package com.example.spring_bean_life.b_jsr250.config;


import com.example.spring_bean_life.b_jsr250.bean.Pen;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 通过注解实现方法 ，
 */
@Configuration
public class Jsr250Config {


    @Bean
    public Pen pen() {
        return new Pen();
    }


}
