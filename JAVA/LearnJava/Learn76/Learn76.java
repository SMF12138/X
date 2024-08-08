package NewLearn.Learn76;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class Learn76 {
    public static void main(String[] args) {
        LocalDateTime now1 = LocalDateTime.now();//获取时间，精确到纳秒
        System.out.println(now1);

        LocalDateTime localDateTime = LocalDateTime.of(2020, 10, 6, 13, 23, 43);
        System.out.println(localDateTime);//获取指定时间，精确到纳秒

        LocalDateTime localDateTime1 = localDateTime.plusYears(1);
        System.out.println(localDateTime1);//加日期时间

        LocalDateTime localDateTime2 = localDateTime.minusMonths(1);
        System.out.println(localDateTime2);//减日期时间

        Duration between1 = Duration.between(localDateTime2, localDateTime1);
        System.out.println(between1);//计算相差时间
        System.out.println(between1.toDays());

        long l = System.currentTimeMillis();//获得时间戳
        System.out.println(l);
        Instant now2 = Instant.now();//获得当前时间
        System.out.println(now2);
        long epochMilli = now2.toEpochMilli();//获得时间戳
        System.out.println(epochMilli);

        LocalDate date1 = LocalDate.of(2008, 8, 8);
        LocalDate date2 = LocalDate.of(2008, 8, 15);
        Period between2 = Period.between(date1, date2);//计算相差时间
        System.out.println(between2.getDays());
        LocalDateTime localDateTime3 = now1.with(TemporalAdjusters.firstDayOfMonth());//调整时间至本月第一天
        System.out.println(localDateTime3);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(dateTimeFormatter.format(now1));
        LocalDateTime localDateTime4 = LocalDateTime.parse("2008-08-08 08:08:08", dateTimeFormatter);//字符串转日期
        System.out.println(localDateTime4);
    }
}
