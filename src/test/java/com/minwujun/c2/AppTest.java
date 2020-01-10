package com.minwujun.c2;

import com.minwujun.c2.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.Test;


/**
 * Created by MIN.WU.JUN on 2020/1/9
 */
public class AppTest {

    @Test
    public void test() {
        System.out.println("IOC容器准备启动...");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        System.out.println("IOC容器启动完毕...");
        println();

        System.out.println("所有注入的组件如下：");
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String each : beanDefinitionNames) {
            System.out.println(each);
        }
        println();

        context.close();

    }

    private void println() {
        System.out.println("****************************************************************************************");
    }
}