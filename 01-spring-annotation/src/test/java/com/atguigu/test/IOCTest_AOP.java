package com.atguigu.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.atguigu.aop.MathCalculator;
import com.atguigu.config.MainConfigOfAOP;

public class IOCTest_AOP {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
            MainConfigOfAOP.class);

        //1����Ҫ�Լ���������
        //		MathCalculator mathCalculator = new MathCalculator();
        //		mathCalculator.div(1, 1);
        MathCalculator mathCalculator = applicationContext.getBean(MathCalculator.class);
        System.out.println("mathCalculator: " + mathCalculator);
        mathCalculator.div(1, 0);

        applicationContext.close();
    }

}