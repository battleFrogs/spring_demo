package com.gjc.spring_bean_definition_get.b_import.selector;

import com.gjc.spring_bean_definition_get.b_import.bean.Person;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 通过ImportRegister注入
 */
public class PersonRegister implements ImportBeanDefinitionRegistrar {


    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata,
                                        BeanDefinitionRegistry registry) {
        registry.registerBeanDefinition("person", new RootBeanDefinition(Person.class));
    }


}
