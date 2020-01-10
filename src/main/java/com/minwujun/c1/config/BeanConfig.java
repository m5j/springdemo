package com.minwujun.c1.config;

import com.minwujun.c1.bean.Person;
import com.minwujun.c1.bean.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by MIN.WU.JUN on 2020/1/9
 */
@Configuration
@Import(value = {Student.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
public class BeanConfig {

    @Bean
    public Person person() {
        return new Person();
    }

    @Bean
    public MyFactoryBean myFactoryBean() {
        return new MyFactoryBean();
    }
}
