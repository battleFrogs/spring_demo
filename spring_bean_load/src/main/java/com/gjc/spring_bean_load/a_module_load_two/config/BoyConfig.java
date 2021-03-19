package com.gjc.spring_bean_load.a_module_load_two.config;

import com.gjc.spring_bean_load.a_module_load_two.bean.Boy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoyConfig {


    @Bean
    public Boy getBoy() {
        return new Boy();
    }

}
