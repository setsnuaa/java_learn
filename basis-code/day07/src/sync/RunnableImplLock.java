package sync;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunnableImplLock implements Runnable {
    private int ticketNum = 50;
    Lock lock = new ReentrantLock();//创建一个锁实现类对象

    @Override
    public void run() {
        while (ticketNum > 0) {
            lock.lock();
            if (ticketNum > 0) {//检查票
                try {
                    Thread.sleep(10);
                    //票存在
                    System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticketNum + "张票");
                    ticketNum--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        }
    }
}
