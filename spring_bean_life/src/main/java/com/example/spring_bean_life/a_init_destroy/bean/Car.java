package com.example.spring_bean_life.a_init_destroy.bean;

public class Car {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void init() {
        System.out.println(name + "被初始化了。。。");
    }
    public void destroy() {
        System.out.println(name + "被销毁了。。。");
    }

}
