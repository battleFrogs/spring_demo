package com.gjc.spring_bean_scan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = PersonComponent.class)
public class ScanConfig {



}
