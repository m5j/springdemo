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

        context.close();
        System.out.println("IOC容器关闭...");
        println();
    }

    private void println() {
        System.out.println("****************************************************************************************");
    }
}