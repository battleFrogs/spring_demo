package l_instance_type.config;


import l_instance_type.bean.Ball;
import org.springframework.beans.factory.FactoryBean;

public class BallFactoryBean implements FactoryBean<Ball> {

    @Override
    public Ball getObject() throws Exception {
        return new Ball("ball");
    }

    @Override
    public Class<?> getObjectType() {
        return Ball.class;
    }


}
