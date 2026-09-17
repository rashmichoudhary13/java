package Multithreading;

public class TestThread {
    public static void main(String[] args) {
        Print t1 = new Print();
        Print t2 = new Print();

        t1.start();
        t2.start();
    }
}
