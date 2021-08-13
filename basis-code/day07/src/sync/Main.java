package sync;

public class Main {
    public static void main(String[] args) {
        RunnableImplLock run = new RunnableImplLock();
        new Thread(run).start();
        new Thread(run).start();
    }
}
