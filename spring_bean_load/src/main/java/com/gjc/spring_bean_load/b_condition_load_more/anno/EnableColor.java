package com.gjc.spring_bean_load.b_condition_load_more.anno;


import com.gjc.spring_bean_load.b_condition_load_more.config.ImportBlackConfigSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(ImportBlackConfigSelector.class)
public @interface EnableColor {



}
