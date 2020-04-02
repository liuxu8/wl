package com.miss.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupOnClass_A {
    public void ter1(){
        System.out.println("老师的动作1");
    }
    public void ter2(){
        System.out.println("老师的动作2");
    }
}
