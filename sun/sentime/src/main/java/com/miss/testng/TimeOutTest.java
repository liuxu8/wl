package com.miss.testng;

import org.testng.annotations.Test;

public class TimeOutTest {
    @Test(timeOut = 3000)
    public void TimeOutSuccess() throws InterruptedException {
        System.out.println("超时测试");
        Thread.sleep(2000);
    }
    @Test(timeOut = 3000)
    public void TimeOutFail() throws InterruptedException {
        System.out.println("超时测试");
        Thread.sleep(3100);
    }
}
