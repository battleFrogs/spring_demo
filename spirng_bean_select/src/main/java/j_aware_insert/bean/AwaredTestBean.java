package j_aware_insert.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.stream.Stream;

/**
 * applicationContext的回调注入
 * 且当前文件必须在spring bean的扫描下
 * <p>
 * BeanNameAware 可以将beanName也注入进来
 */
public class AwaredTestBean implements ApplicationContextAware, BeanNameAware {

    private String beanName;
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }


    //** 测试是否applicationContext能获取的到
    public void printBeanNames() {
        Stream.of(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);
    }

    public String getBeanName() {
        return beanName;
    }

    @Override
    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }
}
