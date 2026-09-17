package Multithreading;

public class TestState {
    public static void main(String[] args) throws InterruptedException {
        ThreadState t1 = new ThreadState();

        System.out.println("Thread is created and state is: " + t1.getState());
        t1.start();

        t1.join();
        System.out.println("Thread is terminated and state is: " + t1.getState());
    }
}
