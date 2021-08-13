package sync;

public class RunnableImpl implements Runnable {
    private int ticketNum = 50;
    Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                if (ticketNum > 0) {//检查票
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //票存在
                    System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticketNum + "张票");
                    ticketNum--;
                }
                else break;//票卖完则退出轮询
            }
        }
    }
}
