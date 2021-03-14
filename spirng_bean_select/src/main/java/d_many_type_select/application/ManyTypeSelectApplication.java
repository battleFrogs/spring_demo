package d_many_type_select.application;

import d_many_type_select.bean.Dog;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ManyTypeSelectApplication {


    public static void main(String[] args) {
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("basic_dl/many_type_select.xml");
        // ofType 使用通过类型选取
//        Map<String, School> beansOfType = applicationContext.getBeansOfType(School.class);
//        beansOfType.forEach((beanName, bean) -> {
//            System.out.println(beanName + " : " + bean.toString());
//        });

        // withAnnotation 使用 通过注解上选取
//        Map<String, Object> beansWithAnnotation = applicationContext.getBeansWithAnnotation(Color.class);
//        beansWithAnnotation.forEach((beanName, bean) -> {
//            System.out.println(beanName + " : " + bean.toString());
//        });

        // getBeanDefinitionNames  获取IOC容器中选择所有bean名称
//        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
//        Stream.of(beanDefinitionNames).forEach(System.out::println);


        // 延迟查找 ， 到用的bean的时候才报错
        ObjectProvider<Dog> dogProvider = applicationContext
                .getBeanProvider(Dog.class);



    }

}
