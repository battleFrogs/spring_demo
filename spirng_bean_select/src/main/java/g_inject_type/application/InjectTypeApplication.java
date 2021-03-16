package g_inject_type.application;

import g_inject_type.bean.Black;
import g_inject_type.bean.Person;
import g_inject_type.bean.Red;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectTypeApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContextXml = new
                ClassPathXmlApplicationContext("basic_dl/inject_type.xml");
        Person personXml = applicationContextXml.getBean(Person.class);
        System.out.println(personXml);

        // 通过类型去匹配
        ApplicationContext applicationContextConfig = new
                AnnotationConfigApplicationContext("g_inject_type.config");
//        Person personConfig = applicationContextConfig.getBean(Person.class);
//        System.out.println(personConfig);
        // 通过名称去匹配
        Object getPerson = applicationContextConfig.getBean("getPerson");
        System.out.println(getPerson);


        // 通过基本属性的直接注入
        ApplicationContext applicationContext = new
                AnnotationConfigApplicationContext("g_inject_type.bean");
        Black black = applicationContext.getBean(Black.class);
        System.out.println(black);

        // 通过外部配置文件注入属性
        ApplicationContext applicationContext1 = new
                AnnotationConfigApplicationContext("g_inject_type.bean");
        Red red = applicationContext1.getBean(Red.class);
        System.out.println(red);
    }

}
