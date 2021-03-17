package k_factory_bean.application;

import k_factory_bean.bean.Toy;
import k_factory_bean.config.RegisterBeanConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FactoryBeanApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new
                AnnotationConfigApplicationContext(RegisterBeanConfig.class);
        Toy bean = applicationContext.getBean(Toy.class);
        System.out.println(bean);
    }

}
