package itmo.lab11;

public class NameThread extends Thread {
    private Object obj;

    public NameThread(Object object) {
        this.obj = object;
    }

    @Override
    public void run() {
        synchronized (obj) {
            while (true) {
                System.out.println("Имя потока : " + Thread.currentThread().getName());
                obj.notify();
                try {
                    obj.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}
