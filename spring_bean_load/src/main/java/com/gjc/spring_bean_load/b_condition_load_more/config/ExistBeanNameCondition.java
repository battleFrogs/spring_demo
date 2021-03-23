package com.gjc.spring_bean_load.b_condition_load_more.config;

import com.gjc.spring_bean_load.b_condition_load_more.anno.OnBeanCondition;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

public class ExistBeanNameCondition implements Condition {


    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        // 获取注解上的beanNames字段值
        Map<String, Object> annotationAttributes = annotatedTypeMetadata.getAnnotationAttributes(OnBeanCondition.class.getName());
        String[] beanNames = (String[]) annotationAttributes.get("beanNames");
        for (String beanName : beanNames) {
            if (!conditionContext.getBeanFactory().containsBeanDefinition(beanName)) {
                return false;
            }
        }

        Class<?>[] values = (Class<?>[]) annotationAttributes.get("value");
        for (Class<?> value : values) {
            if (!conditionContext.getBeanFactory().containsBeanDefinition(value.getName())) {
                return false;
            }
        }

        return true;
    }
}
