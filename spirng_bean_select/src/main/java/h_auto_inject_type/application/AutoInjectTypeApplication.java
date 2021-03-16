package h_auto_inject_type.application;

import h_auto_inject_type.bean.Dog;
import h_auto_inject_type.config.PersonConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoInjectTypeApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new
                AnnotationConfigApplicationContext(PersonConfig.class);
        Dog dog = applicationContext.getBean(Dog.class);
        System.out.println(dog);

    }

}
