package com.gjc.spring_bean_load.a_module_load_one.anno;

import com.gjc.spring_bean_load.a_module_load_one.bean.Person;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;


/**
 * 自定义注解 + import 具体的类（类不用component） , 就能实现类的导入
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(Person.class)
public @interface EnableTavern {

}
