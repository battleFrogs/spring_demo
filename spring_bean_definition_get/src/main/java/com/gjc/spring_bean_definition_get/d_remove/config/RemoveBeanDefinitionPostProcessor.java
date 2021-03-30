package com.gjc.spring_bean_definition_get.d_remove.config;

import com.gjc.spring_bean_definition_get.d_remove.bean.Person;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.TypedStringValue;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.stereotype.Component;

// 暂不推荐使用强转判断
@Component
public class RemoveBeanDefinitionPostProcessor implements BeanFactoryPostProcessor {


    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        //
        BeanDefinitionRegistry registry = (BeanDefinitionRegistry) configurableListableBeanFactory;
        String[] beanDefinitionNames = registry.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            BeanDefinition beanDefinition = configurableListableBeanFactory.getBeanDefinition(beanDefinitionName);
            if (Person.class.getName().equals(beanDefinition.getBeanClassName())) {
                TypedStringValue sex = (TypedStringValue) beanDefinition.getPropertyValues().get("sex");
                if ("male".equals(sex.getValue())) {
                    // 移除BeanDefinition
                    registry.removeBeanDefinition(beanDefinitionName);
                }
            }
        }
    }
}
