package com.minwujun.c2.config;

import com.minwujun.c1.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by MIN.WU.JUN on 2020/1/9
 */
@Configuration
public class BeanConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Person person() {
        return new Person();
    }
}
