package com.miss.testng;

import org.testng.annotations.*;

public class BasicAuto {
    //最基本的注解，用来标记方法为测试的一部分
   @Test
    public void TestCase1(){
        System.out.println("醉清风1！");
    }
    @Test
    public void TestCase2(){
        System.out.println("醉清风2！");
    }
    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("方法前执行：乱了分寸的心动");
    }
    @AfterMethod
    public void AfterMethod(){
        System.out.println("方法后执行：和你醉后缠绵你可记得");
    }
    @BeforeClass
    public void BeforeClass(){
        System.out.println("类之前执行");
    }

    @AfterClass
    public void AfterClass(){
        System.out.println("类之后执行");
    }
    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("BeforeSuite测试");

    }
    @AfterSuite
    public void AfterSuite(){
        System.out.println("AfterSuite测试");

    }
}


