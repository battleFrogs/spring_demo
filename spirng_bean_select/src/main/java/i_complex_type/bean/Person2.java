package i_complex_type.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Component
public class Person2 {

    @Value("#{new String[] {'张三', '张仨'}}")
    private String[] names;

    @Value("#{{'333333', '3333', '33'}}")
    private List<String> tels;

    // 引用现有的Bean，以及创建新的Bean
    @Value("#{{@miaomiao, new i_complex_type.bean.Cat2()}}")
    private Set<Cat2> cats;

    @Value("#{{'喵喵': @miaomiao.name, '猫猫': new i_complex_type.bean.Cat2().name}}")
    private Map<String, Object> events;

    @Value("#{{'123': '牵着手', '456': '抬起头', '789': '我们私奔到月球'}}")
    private Properties props;


}
