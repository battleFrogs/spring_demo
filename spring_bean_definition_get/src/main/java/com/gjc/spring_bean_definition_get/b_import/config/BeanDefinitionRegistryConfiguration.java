package com.gjc.spring_bean_definition_get.b_import.config;

import com.gjc.spring_bean_definition_get.b_import.selector.PersonRegister;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({PersonRegister.class})
public class BeanDefinitionRegistryConfiguration {



}
