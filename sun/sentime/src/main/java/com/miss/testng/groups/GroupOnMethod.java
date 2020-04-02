package com.miss.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupOnMethod {
    @Test(groups = "sever")
    public void test1(){
        System.out.println("这是服务端1号的测试方法***");
    }
    @Test(groups = "sever")
    public void test2(){
        System.out.println("这是服务端2号的测试方法***");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端1号的测试方法###");
    }
    @Test(groups = "sever")
    public void test4(){
        System.out.println("这是服务端4号的测试方法###");
    }
    @BeforeGroups("client")
    public void BeforeMethod(){
        System.out.println("========客户组运行之前的方法========");
    }
    @AfterGroups("client")
    public void AfterMethod(){
        System.out.println("========客户组运行后的方法========");
    }
}
