package itmo.lab11;

public class StateThread implements Runnable {
    @Override
    public void run() {
        Thread.State state = Thread.currentThread().getState();
        System.out.println("- " + Thread.currentThread().getName() + "; Поток Состояние = " + state);
    }
}
