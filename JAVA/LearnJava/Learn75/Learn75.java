package NewLearn.Learn75;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Learn75 {
    public static void main(String[] args) throws ParseException {
        Calendar calendar = Calendar.getInstance();//获取当前的日历对象
        System.out.println(calendar);
        int year = calendar.get(Calendar.YEAR);//也可以填1代表年
        System.out.println(year);
        int month = calendar.get(Calendar.MONTH);//也可以填2代表月
        System.out.println(month);//0-11表示一年中的第几个月
        int day = calendar.get(Calendar.DAY_OF_MONTH);//表示一月中的第几天
        System.out.println(day);
        calendar.set(2008, 8, 8, 8, 8, 8);//设置年到秒(8表示九月)
        System.out.println(calendar.get(Calendar.YEAR) + "年" + calendar.get(Calendar.MONTH) + "月" + calendar.get(Calendar.DAY_OF_MONTH) + "日");
        calendar.add(Calendar.YEAR, -2);//减去两年
        System.out.println(calendar.get(Calendar.YEAR) + "年" + calendar.get(Calendar.MONTH) + "月" + calendar.get(Calendar.DAY_OF_MONTH) + "日");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String str = "2008-08-08 08:08:08 888";
        Date date = simpleDateFormat.parse(str);
        calendar.setTime(date);//直接将data对象传入设置时间
        Date time = calendar.getTime();//获取日历代表的时期
        String s = simpleDateFormat.format(time);
        System.out.println(time);
        System.out.println(s);
    }
}
