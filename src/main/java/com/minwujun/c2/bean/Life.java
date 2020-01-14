package com.minwujun.c2.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 用此类演示bean的生命周期
 * Created by MIN.WU.JUN on 2020/1/14
 */
public class Life implements BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    @Override
    public void setBeanName(String name) {
        System.out.println("Life类的setBeanName方法：" + name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Life类的setBeanFactory方法：" + beanFactory);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Life类的setApplicationContext方法：" + applicationContext);
    }

    public void init() {
        System.out.println("Life类的自定义init方法");
    }

    public void destroy() {
        System.out.println("Life类的自定义destroy方法");
    }
}
