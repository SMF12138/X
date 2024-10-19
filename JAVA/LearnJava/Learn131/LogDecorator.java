package NewLearn.Learn131;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LogDecorator extends FlyableDecorator {//在有祖宗FlyableDecorator修饰器后子修饰器直接继承而不再实现接口

    public LogDecorator(Flyable flyable) {
        super(flyable);
    }

    @Override
    public void fly() {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        System.out.println(sdf.format(now) + "起飞了");
        super.fly();
        now = new Date();
        System.out.println(sdf.format(now) + "降落了");
    }
}
