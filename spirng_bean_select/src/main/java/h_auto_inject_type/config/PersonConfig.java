package h_auto_inject_type.config;

import h_auto_inject_type.bean.Dog;
import h_auto_inject_type.bean.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PersonConfig {

    @Bean
    public Person getPersonOne() {
        Person person = new Person();
        person.setAge("22");
        person.setName("gjgj");
        return person;
    }

    @Bean
    @Primary  // 声明为可默认注入的bean
    public Person getPersonTwo() {
        Person person = new Person();
        person.setName("erewr");
        person.setAge("32");
        return person;
    }

    // qualifier 可指定注入选择的bean
    @Bean
    public Dog dog(@Qualifier("getPersonOne") Person person) {
        Dog dog = new Dog();
        dog.setPerson(person);
        return dog;
    }



}
