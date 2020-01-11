package com.minwujun.c2.bean;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by MIN.WU.JUN on 2020/1/9
 */
@Setter
@Getter
public class Person {
    private String name;
    private int age;

    public Person() {
        System.out.println("Person无参构造");
    }

    public void init() {
        System.out.println("Person自定义的init方法");
    }

    public void destroy() {
        System.out.println("Person自定义的destroy方法");
    }

}
