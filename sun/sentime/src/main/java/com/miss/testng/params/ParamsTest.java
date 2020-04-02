package com.miss.testng.params;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamsTest {
    @Test
    @Parameters({"name","age"})
    public void Test(String name,int age){
        System.out.println("名字是"+name  + "年龄是" + age);
    }
}
