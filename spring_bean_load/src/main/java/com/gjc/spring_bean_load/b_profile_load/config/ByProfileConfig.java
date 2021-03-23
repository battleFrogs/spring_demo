package com.gjc.spring_bean_load.b_profile_load.config;

import com.gjc.spring_bean_load.b_profile_load.bean.AnimalOne;
import com.gjc.spring_bean_load.b_profile_load.bean.PersonOne;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("city")
public class ByProfileConfig {

    @Bean
    public PersonOne personOne() {
        return new PersonOne();
    }

    @Bean
    public AnimalOne animalOne() {
        return new AnimalOne();
    }


}
