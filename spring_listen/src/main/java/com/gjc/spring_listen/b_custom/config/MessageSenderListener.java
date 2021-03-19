package com.gjc.spring_listen.b_custom.config;

import com.gjc.spring_listen.b_custom.event.RegisterSuccessEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MessageSenderListener {

    @EventListener
    public void registerSuccess(RegisterSuccessEvent registerSuccessEvent) {
        System.out.println("注册成功触发事件");
    }

}
