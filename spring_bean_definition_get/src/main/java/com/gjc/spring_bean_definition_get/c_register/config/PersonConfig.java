package com.gjc.spring_bean_definition_get.c_register.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(PersonRegister.class)
public class PersonConfig {



}
