package com.example.spring_bean_life.a_init_destroy.application;

import com.example.spring_bean_life.a_init_destroy.bean.Car;
import com.example.spring_bean_life.a_init_destroy.bean.Dog;
import com.example.spring_bean_life.a_init_destroy.config.InitDestroyConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitDestroyApplication {


    public static void main(String[] args) {

        // 通过配置文件实现init-destroy方法
//        ClassPathXmlApplicationContext applicationContext = new
//                ClassPathXmlApplicationContext("init_destory.xml");
//        Car car = applicationContext.getBean(Car.class);
//        System.out.println(car);
//        applicationContext.close();


        // 通过配置类实现init-destroy方法
        AnnotationConfigApplicationContext applicationContext1 = new
                AnnotationConfigApplicationContext(InitDestroyConfig.class);
        Dog dog = applicationContext1.getBean(Dog.class);
        System.out.println(dog);
        applicationContext1.close();
    }


}
