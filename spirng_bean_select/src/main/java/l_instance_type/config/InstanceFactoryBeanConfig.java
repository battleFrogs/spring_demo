package l_instance_type.config;

import l_instance_type.bean.Ball;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InstanceFactoryBeanConfig {


    @Bean
    public BallInstanceFactroyBean ballInstanceFactroyBean() {
        return new BallInstanceFactroyBean();
    }

    @Bean
    public Ball getBall(BallInstanceFactroyBean ballInstanceFactroyBean) {
        return ballInstanceFactroyBean.getBall();
    }



}
