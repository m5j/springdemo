package com.minwujun.c2.config;

import com.minwujun.c2.bean.Life;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by MIN.WU.JUN on 2020/1/9
 */
@Configuration
public class BeanConfig {

//    @Bean(initMethod = "init", destroyMethod = "destroy")
//    public Person person() {
//        return new Person();
//    }
//
//    @Bean
//    public Dog dog() {
//        return new Dog();
//    }

//    @Bean
//    public Cat cat() {
//        return new Cat();
//    }
//
//    @Bean
//    public MyBeanPostProcessor myBeanPostProcessor() {
//        return new MyBeanPostProcessor();
//    }


    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Life life() {
        return new Life();
    }

}
