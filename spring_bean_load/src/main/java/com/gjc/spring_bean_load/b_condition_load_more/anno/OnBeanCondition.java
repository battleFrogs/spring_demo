package com.gjc.spring_bean_load.b_condition_load_more.anno;

import com.gjc.spring_bean_load.b_condition_load_more.config.ConditionLoadMoreConfig;
import com.gjc.spring_bean_load.b_condition_load_more.config.ExistBeanNameCondition;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target({ElementType.METHOD, ElementType.TYPE})
@Conditional(ExistBeanNameCondition.class)
public @interface OnBeanCondition {

    String[] beanNames() default {};

    Class<?>[] value() default {};

}
