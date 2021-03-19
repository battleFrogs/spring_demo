package com.gjc.spring_bean_load.a_module_load_four.anno;

import com.gjc.spring_bean_load.a_module_load_four.config.WaitRegister;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(WaitRegister.class)
public @interface EnableTavern {


}
