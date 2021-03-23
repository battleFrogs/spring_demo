package com.gjc.spring_bean_load.b_condition_load.config;

import com.gjc.spring_bean_load.b_condition_load.bean.Blue;
import com.gjc.spring_bean_load.b_condition_load.bean.Red;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionConfig {

    @Bean
    public Blue blue() {
        return new Blue();
    }

    @Bean
    @Conditional(ExistBlueCondition.class)
    public Red red() {
        return new Red();
    }
}
