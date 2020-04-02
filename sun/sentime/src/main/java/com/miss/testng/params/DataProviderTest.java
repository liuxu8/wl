package com.miss.testng.params;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider = "data")
    public void DataProviderTest(String name,int age){
        System.out.println("名字是"+ name + "年龄" + age);
    }
    @DataProvider(name ="data")
    public  Object[][] ProData() {

        Object[][] oj = new Object[][]{
                {"moon",20},
                {"sun",21}
        };
        return  oj;
    }

    @Test(dataProvider = "moon")
    public  void Test1(String name,int age){
        System.out.println("名字moon是"+ name + "年龄" + age);
    }
    @Test(dataProvider = "moon")
    public  void Test2(String name,int age){
        System.out.println("名字是sun"+ name + "年龄" + age);
    }
@DataProvider(name="moon")
    public  Object[][] Privider(Method method){
        Object[][] result = null;
        if(method.getName().equals("Test1")) {
            result = new Object[][]{

                    {"moon",17},
                    {"sun",18}
            };
        }

        else if (method.getName().equals("Test2")){
            result = new Object[][]{

                    {"moon",20},
                    {"sun",21}
            };
        }


        return result;

    }
}
