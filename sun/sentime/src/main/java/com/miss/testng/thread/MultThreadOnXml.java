package com.miss.testng.thread;

import org.testng.annotations.Test;

public class MultThreadOnXml {
@Test
    public void Test1(){
        System.out.printf("Test1 current Thread is : %s%n",Thread.currentThread().getId());
    }
    @Test
    public void Test2(){
        System.out.printf("Test2 current Thread is : %s%n",Thread.currentThread().getId());
    }
    @Test
    public void Test3(){
        System.out.printf("Test3 current Thread is : %s%n",Thread.currentThread().getId());
    }
    @Test
    public void Test4(){
        System.out.printf("Test4 current Thread is : %s%n",Thread.currentThread().getId());
    }
}
