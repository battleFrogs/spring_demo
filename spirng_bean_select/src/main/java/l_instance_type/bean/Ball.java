package l_instance_type.bean;

public class Ball {

    private String name;
    public Ball setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public Ball(String name) {
        this.name = name;
    }
}
