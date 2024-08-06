package NewLearn.Learn74;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Learn74 {
    public static void main(String[] args) throws ParseException {//格式写错的编译时异常
        Date date1 = new Date();//获取系统当前时间
        System.out.println(date1);
        Date date2 = new Date(1000);//获取指定时间
        System.out.println(date2);
        Date date3 = new Date(System.currentTimeMillis());//获取系统当前时间(currentTimeMillis为1970年到现在毫秒数)
        Date date4 = new Date(System.currentTimeMillis() - 1000 * 60 * 10);//获取系统前十分钟时间
        System.out.println(date4);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");//指定格式
        String s = simpleDateFormat.format(date1);//将日期格式化为字符串
        System.out.println(s);
        String str = "2008-08-08 08:08:08 888";
        Date date = simpleDateFormat.parse(str);//将字符串转化成日期
        System.out.println(date);
    }
}
