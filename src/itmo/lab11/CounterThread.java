package itmo.lab11;

import java.util.concurrent.CountDownLatch;

public class CounterThread extends Thread{
    private Counter counter;
    private CountDownLatch countDownLatch;
    public CounterThread(Counter counter,CountDownLatch countDownLatch){
        this.counter = counter;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        for(int i = 0;i <1000;i++){
            counter.increment();
        }
        countDownLatch.countDown(); // уменьшает значение счетчика на 1
    }
}
