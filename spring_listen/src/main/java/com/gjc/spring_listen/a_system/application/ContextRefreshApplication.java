package com.gjc.spring_listen.a_system.application;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ContextRefreshApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new
                AnnotationConfigApplicationContext("com.gjc.spring_listen.a_system.config");
        applicationContext.close();

    }

}
