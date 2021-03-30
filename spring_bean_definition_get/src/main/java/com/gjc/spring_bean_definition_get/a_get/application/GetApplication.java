package com.gjc.spring_bean_definition_get.a_get.application;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.stream.Stream;

public class GetApplication {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("xmlGet.xml");
        Stream.of(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println(applicationContext.getBeanDefinitionCount());

        BeanDefinition person = applicationContext.getBeanFactory().getBeanDefinition("person");
        System.out.println(person);
    }


}
