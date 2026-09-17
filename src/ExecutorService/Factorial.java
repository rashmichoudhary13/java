package ExecutorService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

// We want the thread to return value. For that we use future
public class Factorial implements Callable<Integer> {

    private int number;

    public Factorial(int number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        Thread.sleep(2000);
        if(number <= 1){
            return 1;
        }
        int result = 1;

        for(int i=2; i<=number; i++){
            result *= i;
        }

        return result;
    }
}


class TestFactorial{
    public static void main(String[] args) {
        try (ExecutorService service = Executors.newFixedThreadPool(3)) {
            List<Future<Integer>> list = new ArrayList<>();

            for(int i=0; i<10; i++){
                Factorial task = new Factorial(i);
                list.add(service.submit(task));
            }

            for(Future<Integer> ele: list){
                System.out.println("Result is: " + ele.get());
            }

            service.shutdown();

            if(!service.awaitTermination(10, TimeUnit.SECONDS)){
                System.out.println("Emergency stop");
                service.shutdownNow();
            }
        } catch (InterruptedException | ExecutionException  e) {
            throw new RuntimeException(e);
        }
    }
}