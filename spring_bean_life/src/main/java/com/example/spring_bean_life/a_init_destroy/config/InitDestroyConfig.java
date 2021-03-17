package com.example.spring_bean_life.a_init_destroy.config;

import com.example.spring_bean_life.a_init_destroy.bean.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitDestroyConfig {


    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Dog dog() {
        return new Dog();
    }

}
