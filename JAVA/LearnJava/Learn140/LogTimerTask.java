package NewLearn.Learn140;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

public class LogTimerTask extends TimerTask {//定时任务类需继承TimerTask

    @Override
    public void run() {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        System.out.println(sdf.format(now));
    }
}
