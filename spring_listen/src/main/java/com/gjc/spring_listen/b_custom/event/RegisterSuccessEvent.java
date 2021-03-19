package com.gjc.spring_listen.b_custom.event;

import org.springframework.context.ApplicationEvent;

/**
 * 注册成功的事件 （自定义实现类）
 */
public class RegisterSuccessEvent extends ApplicationEvent {

    public RegisterSuccessEvent(Object source) {
        super(source);
    }
}
