package e_anno_config.config;

import e_anno_config.bean.School;
import e_anno_config.bean.Teacher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 对于xml作为驱动，注解是通过@Configuration来实现
 */
@Configuration
public class AnnoConfig {


    @Bean
    public Teacher teacher() {
        return new Teacher("teacher1", 25);
    }

    @Bean
    public School school(Teacher teacher) {
        return new School("清华北大", teacher);
    }


}
