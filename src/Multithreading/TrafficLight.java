package Multithreading;

public class TrafficLight extends Thread{

    private TrafficColor signal;

    public TrafficLight(TrafficColor signal) {
        this.signal = signal;
    }

    @Override
    public void run() {
        System.out.println("Active Thread: " + signal);
        try {
            Thread.sleep(signal.getTimeMilliSec());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Inactive Thread: " + signal);
    }
}
