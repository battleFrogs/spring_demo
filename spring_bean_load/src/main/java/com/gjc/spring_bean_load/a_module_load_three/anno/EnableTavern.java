package com.gjc.spring_bean_load.a_module_load_three.anno;

import com.gjc.spring_bean_load.a_module_load_three.config.BarImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import({BarImportSelector.class})
public @interface EnableTavern {


}
