package com.gjc.spring_listen.b_custom.application;

import com.gjc.spring_listen.b_custom.service.RegisterService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomListenApplication {


    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new
                AnnotationConfigApplicationContext("com.gjc.spring_listen.b_custom.service", "com.gjc.spring_listen.b_custom.config");
        RegisterService registerService = applicationContext.getBean(RegisterService.class);
        registerService.register("张三");
    }


}
