package j_aware_insert.application;

import j_aware_insert.bean.AwaredTestBean;
import j_aware_insert.config.AwareConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AwareInsertApplication {


    public static void main(String[] args) {

        ApplicationContext applicationContext = new
                AnnotationConfigApplicationContext(AwareConfiguration.class);
        AwaredTestBean bean = applicationContext.getBean(AwaredTestBean.class);
        bean.printBeanNames();
        System.out.println(bean.getBeanName());

    }

}
