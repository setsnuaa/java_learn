package sync;

public class RunnableImpl2 implements Runnable {
    private int ticketNum = 50;

    @Override
    public void run() {
        while (ticketNum > 0) {
            sellTicket();
        }
    }

    public synchronized void sellTicket() {
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
    }
}
