package com.minwujun.c1;

import com.minwujun.c1.bean.Cat;
import com.minwujun.c1.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.Test;


/**
 * Created by MIN.WU.JUN on 2020/1/9
 */
public class AppTest {

    @Test
    public void test() throws Exception {
        System.out.println("IOC容器准备启动...");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Cat cat = (Cat) context.getBean("myFactoryBean");
        System.out.println(cat);
        System.out.println("IOC容器启动完毕...");
        println();

        System.out.println("所有注入的组件如下：");
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        context.getBeanFactory();
        for (String each : beanDefinitionNames) {
            System.out.println(each);
        }
        println();

    }

    private void println() {
        System.out.println("****************************************************************************************");
    }
}