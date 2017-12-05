package com.pansy.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Map;

/*
    当bean的生命周期不同时问题就会出现。假设一个单例beanA需要使用非单例beanB时，也许A中的每一个方法调用都需要使用beanB。
    容器仅创建单例beanA一次，因此只有一次设置属性的机会。容器不能在每次需要单例beanB时提供一个新的beanB的实例。
    一个解决方案是放弃一些控制反转，可以使beanA通过实现ApplicationContextAware接口感知到容器，每个beanA需要的时候就通过
    getBean("B")调用容器请求一个beanB的实例。
 */
public class CommandManager implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public Object process(Map commandState) {
        Command command = createCommand();
        command.setCommandState(commandState);
        return command.execute();
    }

    protected Command createCommand() {
        return this.applicationContext.getBean("command", Command.class);
    }
}
