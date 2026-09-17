package Multithreading;

public class ThreadExecu extends Thread{

    private int threadNum;

    public ThreadExecu(int threadNum){
        this.threadNum = threadNum;
    }

    @Override
    public void run() {
        try {
            System.out.printf("Thread %d has started\n", threadNum);
            Thread.sleep(4000);
            System.out.printf("Thread %d has ended\n", threadNum);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
