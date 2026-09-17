package ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintTask implements Runnable{
    @Override
    public void run(){
        for(int i=1; i <= 10; i++){
            System.out.println(i);
        }
    }
}

class TestPrint{
    public static void main(String[] args) {
        ExecutorService serv = Executors.newSingleThreadExecutor();
        PrintTask task = new PrintTask();

        serv.submit(task);
        serv.shutdown();
    }
}
