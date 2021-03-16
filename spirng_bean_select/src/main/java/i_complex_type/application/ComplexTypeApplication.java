package i_complex_type.application;

import i_complex_type.bean.Person;
import i_complex_type.bean.Person2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComplexTypeApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("basic_dl/complex_type.xml");
        Person bean = applicationContext.getBean(Person.class);
        System.out.println(bean);

        ApplicationContext applicationContext1 = new
                AnnotationConfigApplicationContext("i_complex_type.bean");
        Person2 person2 = applicationContext1.getBean(Person2.class);
        System.out.println(person2);


    }

}
