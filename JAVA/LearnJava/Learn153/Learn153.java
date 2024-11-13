package NewLearn.Learn153;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 创建线程的最后一种方式是线程池技术
 * 本质是一个缓存cache，一般都在服务器启动时初始化，创立N多个线程对象放入线程池中
 * 需要这些对象时直接获取
 */
public class Learn153 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);//创建一个线程池对象，共三个线程
        //只需将处理的任务交给线程池，而无需触碰线程对象
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("做任务");
            }
        });
        executorService.shutdown();//关闭线程池
    }
}
