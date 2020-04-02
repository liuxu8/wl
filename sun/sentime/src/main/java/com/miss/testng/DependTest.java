package com.miss.testng;

import org.testng.annotations.Test;

public class DependTest {
    @Test
    public void test1(){
        System.out.println("测试一执行***");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("测试二执行***");
    }
}
