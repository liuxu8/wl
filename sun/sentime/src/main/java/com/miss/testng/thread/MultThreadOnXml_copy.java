package com.miss.testng.thread;

import org.testng.annotations.Test;

public class MultThreadOnXml_copy {
@Test
    public void Test1(){
        System.out.printf("Test1_copy current Thread is : %s%n",Thread.currentThread().getId());
    }
    @Test
    public void Test2(){
        System.out.printf("Test2_copy current Thread is : %s%n",Thread.currentThread().getId());
    }
    @Test
    public void Test3(){
        System.out.printf("Test3_copy current Thread is : %s%n",Thread.currentThread().getId());
    }
    @Test
    public void Test4(){
        System.out.printf("Test4_copy current Thread is : %s%n",Thread.currentThread().getId());
    }
}
