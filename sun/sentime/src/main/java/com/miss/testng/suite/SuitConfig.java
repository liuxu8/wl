package com.miss.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuitConfig {
    @BeforeSuite
    public  void  BeforeSuite(){
        System.out.println("Before Suite 运行###");
    }

    @AfterSuite
    public  void  AfterSuite(){
        System.out.println("After Suite 运行###");
    }
    @BeforeTest
    public  void  BeforeTest(){
        System.out.println("Before Test 运行###");
    }
    @AfterTest
    public  void  AfterTest(){
        System.out.println("After Test 运行###");
    }
}
