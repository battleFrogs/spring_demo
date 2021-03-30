package com.gjc.spring_bean_definition_get.c_register.application;

import com.gjc.spring_bean_definition_get.c_register.config.PersonConfig;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RegisterApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new
                AnnotationConfigApplicationContext(PersonConfig.class);
        BeanDefinition person = applicationContext.getBeanFactory().getBeanDefinition("person");
        System.out.println(person);
    }

}
