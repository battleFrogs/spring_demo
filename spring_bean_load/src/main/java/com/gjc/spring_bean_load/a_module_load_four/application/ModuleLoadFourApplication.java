package com.gjc.spring_bean_load.a_module_load_four.application;

import com.gjc.spring_bean_load.a_module_load_four.bean.Waiter;
import com.gjc.spring_bean_load.a_module_load_four.config.ConfigAtLast;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 导入 ImportBeanDefinitionRegistrar 注册进入
 */
public class ModuleLoadFourApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new
                AnnotationConfigApplicationContext(ConfigAtLast.class);
        Waiter waiter = applicationContext.getBean(Waiter.class);
        System.out.println(waiter);
    }

}
