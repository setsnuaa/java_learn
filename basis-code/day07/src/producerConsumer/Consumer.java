package producerConsumer;

public class Consumer extends Thread {
    private Product product;//产品
    private int num;
    public Consumer(Product pro) {
        this.product = pro;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (product) {
                if (product.isExist == false) {
                    //没有产品可以消费，等待生产者生产产品
                    try {
                        System.out.println("消费者：等待产品生产...");
                        product.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //被唤醒，或产品存在
                try {
                    System.out.println("消费者：消费产品中...");
                    Thread.sleep(3000);
                    System.out.println("消费者：消费完毕...");
                    product.isExist = false;
                    product.notify();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
