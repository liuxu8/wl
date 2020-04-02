package com.miss.testng;

import org.testng.annotations.Test;

public class IgnoreTest {
    @Test
    public void IgnoreOne(){
        System.out.println("执行测试");
    }
    @Test(enabled = false)
    public void IgnoreTwo(){
        System.out.println("忽略测试");
    }
}
