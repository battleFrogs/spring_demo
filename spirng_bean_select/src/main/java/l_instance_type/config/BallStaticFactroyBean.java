package l_instance_type.config;

import l_instance_type.bean.Ball;

public class BallStaticFactroyBean {

    public static Ball getBall() {
        return new Ball("ball");
    }

}
