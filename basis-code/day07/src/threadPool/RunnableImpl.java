package threadPool;

//创建Runnable任务
public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println("This is "+Thread.currentThread().getName());
    }
}
