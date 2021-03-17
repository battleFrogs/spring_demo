package l_instance_type.application;

import l_instance_type.bean.Ball;
import l_instance_type.config.InstanceFactoryBeanConfig;
import l_instance_type.config.StaticFactroyBeanConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.stream.Stream;

public class InstanceTypeApplication {

    public static void main(String[] args) {

        // 通过配置文件实现静态工厂常见bean
//        ApplicationContext applicationContext = new
//                ClassPathXmlApplicationContext("basic_dl/instance_type.xml");
//        Stream.of(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);

        // 通过 配置类静态工厂创建bean
//        ApplicationContext applicationContext1 = new
//                AnnotationConfigApplicationContext(StaticFactroyBeanConfig.class);
//        Ball ball = applicationContext1.getBean(Ball.class);
//        System.out.println(ball);

        // 通过配置文件实现实例工厂创建bean
//        ApplicationContext applicationContext = new
//                ClassPathXmlApplicationContext("basic_dl/instance_type.xml");
//        Ball ball = applicationContext.getBean(Ball.class);
//        System.out.println(ball);

        // 通过配置类实现实例工厂创建Bean
//        ApplicationContext applicationContext = new
//                AnnotationConfigApplicationContext(InstanceFactoryBeanConfig.class);
//        Ball bean = applicationContext.getBean(Ball.class);
//        System.out.println(bean);
    }

}
