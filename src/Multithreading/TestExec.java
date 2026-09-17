package Multithreading;

import javax.imageio.IIOException;
import java.io.IOException;

public class TestExec {
    public static void main(String[] args) throws InterruptedException {
        ThreadExecu t1 = new ThreadExecu(1);
        ThreadExecu t2 = new ThreadExecu(2);
        ThreadExecu t3 = new ThreadExecu(3);


        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
        t3.join();
    }
}
