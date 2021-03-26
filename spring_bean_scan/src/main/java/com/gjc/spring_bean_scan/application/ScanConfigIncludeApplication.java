package com.gjc.spring_bean_scan.application;

import com.gjc.spring_bean_scan.config.ScanConfigInclude;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

public class ScanConfigIncludeApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new
                AnnotationConfigApplicationContext(ScanConfigInclude.class);
        Stream.of(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);

    }



}
