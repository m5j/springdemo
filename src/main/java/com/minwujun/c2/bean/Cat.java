package com.minwujun.c2.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Cat {

    public Cat() {
        System.out.println("Cat无参构造");
    }

    @PostConstruct
    public void init() {
        System.out.println("Cat的PostConstruct注解");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Cat的PreDestroy注解");
    }
}
