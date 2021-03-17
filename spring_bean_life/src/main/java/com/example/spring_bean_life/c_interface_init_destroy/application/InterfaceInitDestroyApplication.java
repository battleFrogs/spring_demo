package com.example.spring_bean_life.c_interface_init_destroy.application;

import com.example.spring_bean_life.c_interface_init_destroy.config.InterfaceInitDestroyBeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @PostConstruct → InitializingBean → init-method 。
 */
public class InterfaceInitDestroyApplication {

    public static void main(String[] args) {

        System.out.println("准备初始化IOC容器。。。");
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
                InterfaceInitDestroyBeanConfig.class );
        System.out.println("IOC容器初始化完成。。。");
        System.out.println();
        System.out.println("准备销毁IOC容器。。。");
        ctx.close();
        System.out.println("IOC容器销毁完成。。。");

    }


}
