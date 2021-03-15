package f_anno_or_xml.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotationConfigConfiguration {


    @Bean
    public Person person() {
        return new Person();
    }


}
