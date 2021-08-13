package producerConsumer;

public class Producer extends Thread {
    private Product product;//产品

    public Producer(Product pro) {
        this.product = pro;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (product) {
                if (product.isExist == true) {
                    //有产品，生产者等待产品被消费
                    try {
                        product.wait();//生产者进入等待状态
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                //无论是被唤醒，还是没有产品，都应该生产产品
                System.out.println("--------------------------------");
                System.out.println("生产者：正在生产产品...");
                try {
                    Thread.sleep(3000);
                    System.out.println("生产者：产品已生产...");
                    product.isExist = true;
                    product.notify();//唤醒消费者
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
