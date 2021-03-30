package com.gjc.spring_bean_definition_get.d_remove.application;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RemoveApplication {

    public static void main(String[] args) {

        // 使用xml能获取到后置处理器的beanDefinition的类型
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("xmlRemove.xml");
        // 过略了 ，获取不到
        Object man = applicationContext.getBean("man");
        System.out.println(man);

//        Object woman = applicationContext.getBean("woman");
//        System.out.println(woman);
    }

}
