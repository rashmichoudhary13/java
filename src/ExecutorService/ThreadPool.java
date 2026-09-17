package ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPool implements Runnable{
    @Override
    public void run() {
        Thread current = Thread.currentThread();
        System.out.println("Active Thread name: " + current.getName());
        try{
            Thread.sleep(Math.round(Math.random() * 5 + 1) * 1000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        System.out.println("InActive Thread name: " + current.getName());
    }
}

class TestPool{
    public static void main(String[] args) {
        try (ExecutorService service = Executors.newFixedThreadPool(3)) {

            for(int i=0; i < 10; i++){
                ThreadPool task1 = new ThreadPool();
                service.submit(task1);
            }

            service.shutdown();

            if(!service.awaitTermination(10, TimeUnit.SECONDS)){
                System.out.println("Emergency shutdown");
                service.shutdownNow();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
