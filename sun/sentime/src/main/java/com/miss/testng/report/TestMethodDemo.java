package com.miss.testng.report;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethodDemo {
@Test
    public  void test1(){
        Assert.assertEquals(1,2);
    }
    @Test
    public void test2(){
        Assert.assertEquals(1,1);
    }
    @Test
    public void test3(){
        Assert.assertEquals("aaa","sss");
    }
    @Test
    public void logDemo(){
        Reporter.log("这是自己的日志！");
        throw  new RuntimeException("这是自己写的异常");
    }
}
