package l_instance_type.config;

import l_instance_type.bean.Ball;

public class BallInstanceFactroyBean {

    public Ball getBall() {
        return new Ball("ball");
    }

}
