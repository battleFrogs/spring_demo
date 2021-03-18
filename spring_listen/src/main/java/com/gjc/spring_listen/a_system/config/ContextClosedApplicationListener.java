package com.gjc.spring_listen.a_system.config;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * 注解实现监听系统事件
 */
@Component
public class ContextClosedApplicationListener {


    @EventListener
    public void onContextClosedEvent(ContextClosedEvent contextClosedEvent) {
        System.out.println("ContextClosedApplicationListener监听到ContextClosedEvent事件！");
    }


}
