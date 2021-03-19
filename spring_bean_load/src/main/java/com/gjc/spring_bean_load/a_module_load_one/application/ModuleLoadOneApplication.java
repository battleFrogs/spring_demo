package com.gjc.spring_bean_load.a_module_load_one.application;

import com.gjc.spring_bean_load.a_module_load_one.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ModuleLoadOneApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new
                AnnotationConfigApplicationContext("com.gjc.spring_bean_load.a_module_load_one.config");
        Person person = applicationContext.getBean(Person.class);
        System.out.println(person);
    }

}
