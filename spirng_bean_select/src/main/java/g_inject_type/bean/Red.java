package g_inject_type.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:propertie_file/red.properties")
public class Red {

    @Value("${red.name}")
    private String name;
    @Value("${red.order}")
    private Integer order;

    @Override
    public String toString() {
        return "Red{" +
                "name='" + name + '\'' +
                ", order=" + order +
                '}';
    }
}
