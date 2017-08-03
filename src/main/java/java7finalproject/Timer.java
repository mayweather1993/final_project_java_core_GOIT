package java7finalproject;

public class Timer {
    private long start;
    public void startTime(){
        start = System.nanoTime();
    }
    public long getWaitingTime(){
       long waitingTime = System.nanoTime() - start;
       return waitingTime;
    }
}
