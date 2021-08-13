package threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Entry {
    public static void main(String[] args) {
        //创建线程池
        ExecutorService es = Executors.newFixedThreadPool(2);

        //提交任务
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());

        //销毁线程池
        es.shutdown();
    }
}
