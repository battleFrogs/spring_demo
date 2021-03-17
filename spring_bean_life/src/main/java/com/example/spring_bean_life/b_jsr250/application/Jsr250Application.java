package com.example.spring_bean_life.b_jsr250.application;

import com.example.spring_bean_life.b_jsr250.bean.Pen;
import com.example.spring_bean_life.b_jsr250.config.Jsr250Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 主要解决 @Component， @Service这种注解的无法标记痛点使用，通过在bean内部方法上实现注解
 */
public class Jsr250Application {

    public static void main(String[] args) {


        AnnotationConfigApplicationContext applicationContext = new
                AnnotationConfigApplicationContext(Jsr250Config.class);
        Pen bean = applicationContext.getBean(Pen.class);
        System.out.println(bean);
        applicationContext.close();
    }

}
