package com.gjc.spring_listen.b_custom.service;

import com.gjc.spring_listen.b_custom.event.RegisterSuccessEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

@Service
public class RegisterService implements ApplicationEventPublisherAware {


    ApplicationEventPublisher applicationEventPublisher;
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void register(String name) {
        System.out.println(name + "注册成功");
        applicationEventPublisher.publishEvent(new RegisterSuccessEvent(name));
    }


}
