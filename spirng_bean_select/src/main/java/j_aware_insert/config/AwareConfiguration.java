package j_aware_insert.config;

import j_aware_insert.bean.AwaredTestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 将配置扫描当中文件，文件中再去获取回调是否注入applicationContext
 */
@Configuration
public class AwareConfiguration {

    @Bean
    public AwaredTestBean bbb() {
        return new AwaredTestBean();
    }


}
