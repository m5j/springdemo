package com.minwujun.c1.config;

import com.minwujun.c1.bean.Cat;
import org.springframework.beans.factory.FactoryBean;

/**
 * Created by MIN.WU.JUN on 2020/1/9
 */
public class MyFactoryBean implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        return new Cat();  //注入MyFactoryBean的时候，实际上注入的是cat
    }

    @Override
    public Class<?> getObjectType() {
        return Cat.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
