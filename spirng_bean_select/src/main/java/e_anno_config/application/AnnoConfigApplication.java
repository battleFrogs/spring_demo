package e_anno_config.application;

import e_anno_config.component.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnoConfigApplication {

    public static void main(String[] args) {

        // 通过扫描的配置文件，在其下的Bean
//        ApplicationContext applicationContext = new
//                AnnotationConfigApplicationContext(AnnoConfig.class);
//        School school = applicationContext.getBean(School.class);
//        System.out.println(school);


        // 通过扫描的配置文件，再指定的扫描的Component
//        ApplicationContext applicationContext = new
//                AnnotationConfigApplicationContext(AnnoConfig2.class);
//        Person person = applicationContext.getBean(Person.class);
//        System.out.println(person);

        // 扫描指定的路径文件
        ApplicationContext applicationContext = new
                AnnotationConfigApplicationContext("e_anno_config.component");
        Person person = applicationContext.getBean(Person.class);
        System.out.println(person);

    }
}
