package com.gjc.spring_bean_definition_get.b_import.application;

import com.gjc.spring_bean_definition_get.b_import.config.BeanDefinitionRegistryConfiguration;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ImportApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new
                AnnotationConfigApplicationContext(BeanDefinitionRegistryConfiguration.class);
        BeanDefinition person = applicationContext.getBeanFactory().getBeanDefinition("person");
        System.out.println(person);
    }

}
