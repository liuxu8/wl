package com.sun.cn;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;


import java.io.IOException;
import java.nio.charset.Charset;

public class HttpClient {
    @Test
    public void test1() throws IOException {
    //用来存放我们的结果
        String result =null;
        HttpGet get = new HttpGet("http://www.baidu.com");
        //之后执行get方法
        DefaultHttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(),Charset.defaultCharset());
        System.out.println(result);


    }

}
