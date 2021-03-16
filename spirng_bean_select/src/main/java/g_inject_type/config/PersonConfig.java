package g_inject_type.config;

import g_inject_type.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfig {

    // 通过配置的set注入
//    @Bean
//    public Person getPerson() {
//        Person person = new Person();
//        person.setName("cgj");
//        person.setAge("24");
//        return person;
//    }

    // 通过构造器注入
    @Bean
    public Person getPerson() {
        Person person = new Person("zzz", "26");
        return person;
    }




}
