package f_anno_or_xml.application;

import f_anno_or_xml.bean.Person;
import f_anno_or_xml.config.ImportXmlAnnotationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationConfigApplication {


    public static void main(String[] args) {

        // 配置中加xml
        ApplicationContext applicationContext = new
                AnnotationConfigApplicationContext(ImportXmlAnnotationConfiguration.class);

        Person person = applicationContext.getBean(Person.class);
        System.out.println(person);

        // xml中加config
        ApplicationContext applicationContext1 = new
                ClassPathXmlApplicationContext("basic_dl/anno_or_xml.xml");
        Person person1 = applicationContext1.getBean(Person.class);
        System.out.println(person1);

    }

}
