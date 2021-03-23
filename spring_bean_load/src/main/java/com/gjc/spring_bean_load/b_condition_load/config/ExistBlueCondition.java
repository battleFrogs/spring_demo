package com.gjc.spring_bean_load.b_condition_load.config;

import com.gjc.spring_bean_load.b_condition_load.bean.Blue;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class ExistBlueCondition implements Condition {


    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        return conditionContext.getBeanFactory().containsBeanDefinition("blue");
    }

}
