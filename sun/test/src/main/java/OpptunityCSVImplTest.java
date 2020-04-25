package main.java;
import org.testng.annotations.Test;


import java.text.SimpleDateFormat;




public class DataTypeUtilsTest {
    //不精确的时间
    @Test
    public void formatDate() throws Exception{
        String params = "2018-3-20";
        String result = DataTypeUtils.formatDate(params);
        System.out.println(result);

        SimpleDateFormat format = new SimpleDateFormat(DATETIME_FORMAT);
        String result2 = format.parse(params).toString();
        System.out.println(result2);
    }

    //合格的时间
    @Test
    public void formatDate2() throws Exception{
        String params = "2018-3-20 00:00:00";
        String result = DataTypeUtils.formatDate(params);
        System.out.println(result);
    }

    @Test
    public void formatDate3(){
        try{
            String params = "20180320";
            String result = DataTypeUtils.formatDate(params);
            System.out.println(result);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}