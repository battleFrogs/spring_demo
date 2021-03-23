package com.gjc.spring_bean_load.b_condition_load_more.config;

import com.gjc.spring_bean_load.a_module_load_three.anno.EnableTavern;
import com.gjc.spring_bean_load.b_condition_load_more.anno.EnableColor;
import com.gjc.spring_bean_load.b_condition_load_more.anno.OnBeanCondition;
import com.gjc.spring_bean_load.b_condition_load_more.bean.Black;
import com.gjc.spring_bean_load.b_condition_load_more.bean.Blue;
import com.gjc.spring_bean_load.b_condition_load_more.bean.Red;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableColor
public class ConditionLoadMoreConfig {

    @Bean
    @OnBeanCondition(value = Blue.class)
    public Red red() {
        return new Red();
    }

    @Bean
    @OnBeanCondition(beanNames = "com.gjc.spring_bean_load.b_condition_load_more.bean.Blue")
    public Black black() {
        return new Black();
    }

}
