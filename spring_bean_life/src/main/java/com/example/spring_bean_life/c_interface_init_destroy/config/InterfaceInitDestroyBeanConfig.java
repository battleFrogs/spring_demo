package com.example.spring_bean_life.c_interface_init_destroy.config;

import com.example.spring_bean_life.c_interface_init_destroy.bean.InterfaceInitDestroyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InterfaceInitDestroyBeanConfig {


    @Bean
    public InterfaceInitDestroyBean getBean() {
        return new InterfaceInitDestroyBean();
    }


}
