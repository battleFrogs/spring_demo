package com.gjc.spring_bean_load.a_module_load_two.application;

import com.gjc.spring_bean_load.a_module_load_two.bean.Boy;
import com.gjc.spring_bean_load.a_module_load_two.bean.Girl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Import 包含Config配置类的信息
 */
public class ModuleLoadTwoApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new
                AnnotationConfigApplicationContext("com.gjc.spring_bean_load.a_module_load_two.config");
        Boy boy = applicationContext.getBean(Boy.class);
        Girl girl = applicationContext.getBean(Girl.class);
        System.out.println(boy + "_" + girl);
    }

}
