package k_factory_bean.config;

import k_factory_bean.bean.Ball;
import k_factory_bean.bean.Car;
import k_factory_bean.bean.Child;
import k_factory_bean.bean.Toy;
import org.springframework.beans.factory.FactoryBean;

/**
 * 实现工厂Bean ， 实现两个接口分别实现
 * 1. getObject你要获取到的Bean
 * 2. getObjectType 实现工厂要生成的Bean的父类型
 * <p>
 * bean的创建时机 ：  只有 ToyFactoryBean 被初始化，说明 FactoryBean 本身的加载是伴随 IOC 容器的初始化时机一起的
 * 而 FactoryBean 生产 Bean 的机制是延迟生产 ，且单实例
 */
public class ToyFactoryBean implements FactoryBean<Toy> {

    private Child child;

    public void setChild(Child child) {
        this.child = child;
    }


    @Override
    public Toy getObject() throws Exception {
        switch (child.getWantToy()) {
            case "ball":
                return new Ball("ball");
            case "car":
                return new Car("car");
            default:
                return null;

        }

    }

    @Override
    public Class<?> getObjectType() {
        return Toy.class;
    }


}
