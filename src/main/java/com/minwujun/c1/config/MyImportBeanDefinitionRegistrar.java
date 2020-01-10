package com.minwujun.c1.config;

import com.minwujun.c1.bean.Dog;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * AnnotationMetadata：当前类的注解信息
 * BeanDefinitionRegistry：BeanDefinition注册类。把所有需要添加到容器中的bean注入
 * <p>
 * Created by MIN.WU.JUN on 2020/1/9
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean isExistStudent = registry.containsBeanDefinition("Student");
        boolean isExistTeacher = registry.containsBeanDefinition("Teacher");
        //如果容器中同时存在Student和Teacher，就注入Dog
        if (isExistStudent && isExistTeacher) {
            //RootBeanDefinition是重要的类，封装Bean的
            RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Dog.class);
            registry.registerBeanDefinition("dog", rootBeanDefinition);
        }
    }
}
