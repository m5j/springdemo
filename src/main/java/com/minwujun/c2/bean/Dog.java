package com.minwujun.c2.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Dog implements InitializingBean, DisposableBean {

    public Dog() {
        System.out.println("Dog无参构造");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Dog重写的afterPropertiesSet方法");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Dog重写的destroy方法");
    }


}
