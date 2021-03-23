package com.gjc.spring_bean_load.b_profile_load.config;

import com.gjc.spring_bean_load.b_profile_load.bean.PersonTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ByProfileMethodConfig {


    @Bean
    @Profile("city")
    public PersonTwo personTwo() {
        return new PersonTwo();
    }


}
