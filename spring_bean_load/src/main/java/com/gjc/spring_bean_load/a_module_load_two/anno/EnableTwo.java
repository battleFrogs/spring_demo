package com.gjc.spring_bean_load.a_module_load_two.anno;

import com.gjc.spring_bean_load.a_module_load_two.bean.Girl;
import com.gjc.spring_bean_load.a_module_load_two.config.BoyConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import({Girl.class, BoyConfig.class})
public @interface EnableTwo {


}
