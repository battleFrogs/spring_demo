package com.gjc.spring_bean_load.a_module_load_three.application;

import com.gjc.spring_bean_load.a_module_load_three.bean.Bar;
import com.gjc.spring_bean_load.a_module_load_three.config.ConfigAtLast;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 引入 ImportSelector
 */
public class ModuleLoadThreeApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new
                AnnotationConfigApplicationContext(ConfigAtLast.class);
        Bar bar = applicationContext.getBean(Bar.class);
        System.out.println(bar);
    }

}
