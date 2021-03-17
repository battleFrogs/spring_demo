package com.example.spring_bean_life.b_jsr250.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 解决痛点 对于那些使用模式注解的 Bean ,直接再Bean上使用
 */
public class Pen {

    private Integer ink;

    @Override
    public String toString() {
        return "Pen{" + "ink=" + ink + '}';
    }

    @PostConstruct
    public void addInk() {
        System.out.println("钢笔中已加满墨水。。。");
        this.ink = 100;
    }

    @PreDestroy
    public void outwellInk() {
        System.out.println("钢笔中的墨水都放干净了。。。");
        this.ink = 0;
    }

}
