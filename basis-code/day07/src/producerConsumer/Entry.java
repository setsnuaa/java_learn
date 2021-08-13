package producerConsumer;

public class Entry {
    public static void main(String[] args) {
        Product pro = new Product();
        Producer producer = new Producer(pro);
        Consumer consumer = new Consumer(pro);
        producer.start();
        consumer.start();
    }
}
