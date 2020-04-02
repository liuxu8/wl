package com.miss.testng.groups;

import org.testng.annotations.Test;

@Test(groups ="students")
public class GroupOnClass_B {
    public void stu1(){
        System.out.println("学生B的动作1");
    }
    public void stu2(){
        System.out.println("学生B的动作2");
    }
}
