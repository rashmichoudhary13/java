package Multithreading;

public class ThreadState extends Thread{
    @Override
    public void run(){
        try {
            Thread.sleep(4000);
            System.out.println("Thread started running and state is: " + getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
