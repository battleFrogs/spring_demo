package i_complex_type.bean;

import org.springframework.stereotype.Component;

@Component("miaomiao")
public class Cat2 {

    private String name = "cat";


    public String getName() {
        return name;
    }

    public Cat2 setName(String name) {
        this.name = name;
        return this;
    }
}
