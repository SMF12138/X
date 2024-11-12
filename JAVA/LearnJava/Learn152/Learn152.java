package NewLearn.Learn152;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Learn152 {
    public static void main(String[] args) {
        //不同与接口和继承，Callable能获取线程返回值
        FutureTask<Integer> task = new FutureTask<>(new Callable<Integer>() {//创建未来任务FutureTask对象
            @Override
            public Integer call() throws Exception {//Callable中可以抛出异常
                System.out.println("要处理的业务");
                Thread.sleep(2000);
                return 1;
            }
        });
        Thread t = new Thread(task);
        t.start();
        try {
            System.out.println(task.get());//task.get()获取线程返回值，但必须等call()执行完才能拿到，因此会阻塞其它(主)线程
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
