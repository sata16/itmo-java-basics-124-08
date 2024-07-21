package itmo.lab11;

public class MyThread extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i <= 10) {
            System.out.println(i + "- " + Thread.currentThread().getName());
            i++;
        }

    }
}
