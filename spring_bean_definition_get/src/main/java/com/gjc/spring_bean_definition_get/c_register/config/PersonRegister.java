package com.gjc.spring_bean_definition_get.c_register.config;

import com.gjc.spring_bean_definition_get.c_register.bean.Person;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class PersonRegister implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        registry.registerBeanDefinition(
                "person", BeanDefinitionBuilder.genericBeanDefinition(Person.class)
                        .addPropertyValue("name", "gjc").getBeanDefinition());
    }
}
