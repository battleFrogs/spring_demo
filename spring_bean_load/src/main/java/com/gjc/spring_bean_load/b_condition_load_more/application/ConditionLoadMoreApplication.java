package com.gjc.spring_bean_load.b_condition_load_more.application;

import com.gjc.spring_bean_load.b_condition_load_more.config.ConditionLoadMoreConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

public class ConditionLoadMoreApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new
                AnnotationConfigApplicationContext(ConditionLoadMoreConfig.class);
        Stream.of(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);

    }

}
