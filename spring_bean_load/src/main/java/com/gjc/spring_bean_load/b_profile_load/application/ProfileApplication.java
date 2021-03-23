package com.gjc.spring_bean_load.b_profile_load.application;

import com.gjc.spring_bean_load.b_profile_load.config.ByProfileConfig;
import com.gjc.spring_bean_load.b_profile_load.config.ByProfileMethodConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

/**
 * 注意new AnnotationConfigApplicationContext 的时候，
 * 如果传入了配置类，它内部就自动初始化完成了，那些 Bean 也就都创建好了 ，
 * <p>
 * 1. 所以在一开始不用先传配置类
 * 2.设置激活环境city
 * 3.通过后续register和refresh
 */
public class ProfileApplication {

    public static void main(String[] args) {

//        AnnotationConfigApplicationContext applicationContext = new
//                AnnotationConfigApplicationContext(ByProfileConfig.class);
//        Stream.of(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);

        // 只有激活当前环境city ，才会有该bean，还必须得用refresh
        AnnotationConfigApplicationContext applicationContext = new
                AnnotationConfigApplicationContext();
        applicationContext.getEnvironment().setActiveProfiles("city");
        applicationContext.register(ByProfileConfig.class, ByProfileMethodConfig.class);
        applicationContext.refresh();
        Stream.of(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);

    }


}
