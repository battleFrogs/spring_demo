package com.gjc.spring_bean_scan.config;

import com.gjc.spring_bean_scan.Animal;
import com.gjc.spring_bean_scan.bean.Dog;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import java.io.*;
import java.lang.reflect.Field;

/**
 * 指定过滤的规则，但是ComponentScan默认规则 useDefaultFilters,存在一个交集问题,自动带入
 */
@Configuration
@ComponentScan(basePackages = "com.gjc.spring_bean_scan.bean",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Animal.class))
public class ScanConfigInclude {





}
