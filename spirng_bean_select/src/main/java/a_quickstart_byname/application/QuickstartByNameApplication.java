package a_quickstart_byname.application;

import a_quickstart_byname.bean.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuickstartByNameApplication {

    public static void main(String[] args) {

        BeanFactory beanFactory = new
                ClassPathXmlApplicationContext("basic_dl/quickstart-byname.xml");
        Person person = (Person) beanFactory.getBean("person");
        System.out.println(person);

    }

}
