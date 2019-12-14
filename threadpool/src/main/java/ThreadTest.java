import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadTest {

    public static void main(String[] args) {

        /**
         * corePoolSize： 线程池核心线程数
         * maximumPoolSize：线程池最大数
         * keepAliveTime： 空闲线程存活时间
         * unit： 时间单位
         * workQueue： 线程池所使用的缓冲队列
         * threadFactory：线程池创建线程使用的工厂
         * handler： 线程池对拒绝任务的处理策略
         */
        ThreadPoolExecutor pool = new ThreadPoolExecutor(3, 3, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<>(100));

        //任务1

        for (int i = 0; i < 100; i++) {
            pool.execute(new Runnable() {

                @Override
                public void run() {
                    System.out.println("-------------helloworld_001---------------" + Thread.currentThread().getName());
                }
            });
        }
    }
}
