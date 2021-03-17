package k_factory_bean.config;

import k_factory_bean.bean.Child;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RegisterBeanConfig {


    @Bean
    public Child child() {
        return new Child();
    }

    @Bean
    public ToyFactoryBean toyFactoryBean(Child child) {
        ToyFactoryBean toyFactoryBean = new ToyFactoryBean();
        toyFactoryBean.setChild(child);
        return toyFactoryBean;
    }


}
