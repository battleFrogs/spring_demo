package c_quickstart_inject_attribute.application;

import c_quickstart_inject_attribute.bean.School;
import c_quickstart_inject_attribute.bean.Teacher;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuickstartInjectAttribute {

    public static void main(String[] args) {
        BeanFactory beanFactory = new
                ClassPathXmlApplicationContext("/basic_dl/quickstart_inject_attribute.xml");
        School school = beanFactory.getBean(School.class);
        System.out.println(school);

        Teacher teacher = beanFactory.getBean(Teacher.class);
        System.out.println(teacher);

    }

}
