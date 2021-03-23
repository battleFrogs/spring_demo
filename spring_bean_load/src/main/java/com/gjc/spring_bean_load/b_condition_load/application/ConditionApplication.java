package com.gjc.spring_bean_load.b_condition_load.application;

import com.gjc.spring_bean_load.b_condition_load.config.ConditionConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

public class ConditionApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new
                AnnotationConfigApplicationContext(ConditionConfig.class);
//        applicationContext.register(ConditionConfig.class);
//        applicationContext.refresh();
        Stream.of(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);


    }

}
