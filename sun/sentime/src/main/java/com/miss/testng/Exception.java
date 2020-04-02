package com.miss.testng;

import org.testng.annotations.Test;

public class Exception {
    /*
    *什么时候会用到异常测试
    * 在我们的期望结果为一个异常的时候
    * 比如传入了一个不合法的参数，程序抛出了异常
     */
    @Test(expectedExceptions = RuntimeException.class)
    public void RunTimeExceptionFail(){
        System.out.println("异常测试");
    }
    @Test(expectedExceptions = RuntimeException.class)
    public void RunTimeExceptionSuccess(){
        System.out.println("异常测试Success!");
        throw new RuntimeException();
    }
}
