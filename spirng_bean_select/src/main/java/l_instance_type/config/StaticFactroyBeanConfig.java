package l_instance_type.config;

import l_instance_type.bean.Ball;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StaticFactroyBeanConfig {

    @Bean
    public Ball getBall() {
        return BallStaticFactroyBean.getBall();
    }

}
