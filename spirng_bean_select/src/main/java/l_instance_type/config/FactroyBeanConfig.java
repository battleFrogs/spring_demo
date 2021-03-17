package l_instance_type.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactroyBeanConfig {


    @Bean
    public BallFactoryBean ballFactoryBean() {
        return new BallFactoryBean();
    }


}
