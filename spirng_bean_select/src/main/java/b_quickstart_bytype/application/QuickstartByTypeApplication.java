package b_quickstart_bytype.application;

import b_quickstart_bytype.bean.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuickstartByTypeApplication {


    public static void main(String[] args) {

        BeanFactory factory = new
                ClassPathXmlApplicationContext("basic_dl/qucikstart-bytype.xml");
        Person person = factory.getBean(Person.class);
        System.out.println(person);

    }


}
