package Multithreading;

public enum TrafficColor {
    RED(9000),
    YELLOW(1000),
    GREEN(3000);

    private final int timeMilliSec;

    TrafficColor(int timeMilliSec) {
        this.timeMilliSec = timeMilliSec;
    }

    public int getTimeMilliSec(){
        return timeMilliSec;
    }
}
