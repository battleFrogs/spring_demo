package com.gjc.spring_listen.a_system.application;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ContextRefreshedEvent  ： IOC 容器刷新完毕但尚未启动
 * ContextClosedEvent ：  IOC 容器已经关闭但尚未销毁所有 Bean
 * ContextStartedEvent：所有单实例 Bean 刚创建完成后
 * ContextStoppedEvent  ： 在 ContextClosedEvent 触发之后才会触发
 */
public class ContextRefreshApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new
                AnnotationConfigApplicationContext("com.gjc.spring_listen.a_system.config");
        applicationContext.close();

    }

}
