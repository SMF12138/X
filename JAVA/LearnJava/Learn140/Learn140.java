package NewLearn.Learn140;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Learn140 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date firstTime = sdf.parse("2024-08-1 18:43:00");
            Timer timer = new Timer(true);//创建定时器对象(本质就是一个线程，如果是后台任务。建议定义为守护线程)
            timer.schedule(new LogTimerTask(),firstTime,1000);//LogTimerTask为自定义定时任务类，从firstTime开始每秒执行一次

            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    System.out.println("使用匿名内部类");
                }
            },firstTime,1000);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
