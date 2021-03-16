package h_auto_inject_type.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.inject.Inject;

@Component
public class Dog {


    //**********************************
    //属性标记注入
    @Autowired
    private Person person;

    //构造器注入
//    private Person person;
//    @Autowired
//    public Dog(Person person) {
//        this.person = person;
//    }

    // set注入
//    private Person person;
//    @Autowired
//    public Dog setPerson(Person person) {
//        this.person = person;
//        return this;
//    }

    //********************************************
    // 通过JSR-250规范注入
//    @Resource //通过名称/类型注入
//    private Person person;

    // 通过JSR-330规范注入
//    @Inject //按照类型注入，不依赖spring框架，需额外引用其他依赖
//    private Person person;


    public Person getPerson() {
        return person;
    }

    public Dog setPerson(Person person) {
        this.person = person;
        return this;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "person=" + person +
                '}';
    }
}
