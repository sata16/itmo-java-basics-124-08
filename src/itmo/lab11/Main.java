package itmo.lab11;

import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //1 класс MyThread
        for (int i = 1; i < 5; i++) {
            MyThread myThread = new MyThread();
            System.out.println("Поток Имя = " + myThread.getName() + "; Поток Состояние = " + myThread.getState());
            myThread.start();
        }
        //2 класс stateThread
        Thread stateThread = new Thread(new StateThread());
        System.out.println("Поток Имя = " + stateThread.getName() + "; Поток Состояние = " + stateThread.getState());
        stateThread.start();
        try {
            stateThread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Поток Имя = " + stateThread.getName() + "; Поток Состояние = " + stateThread.getState());
        //3 класс Counter и CounterThread
        Counter counter = new Counter();
        CountDownLatch countDownLatch = new CountDownLatch(100);
        for (int i = 0; i < 100; i++) {
            CounterThread counterThread = new CounterThread(counter, countDownLatch);
            counterThread.start();
        }
        //Thread.sleep(1000);
        countDownLatch.await(); //Главный поток останавливается в этом месте и и ждет до тех пор, пока countDownLatch не станет равным 0.
        System.out.println(counter.getCount());

        //4 класс NameThread
        Object obj = new Object();
        NameThread nameThread = new NameThread(obj);
        NameThread nameThread1 = new NameThread(obj);
        nameThread.start();
        nameThread1.start();


    }
}
