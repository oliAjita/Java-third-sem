
class FirstThread implements Runnable {

    public void run() {
        for (int n = 1; n <= 40; n++) {
            if (n % 2 == 0) {
                System.out.println("FirstThread prints: " + n);
            }
        }
    }
}

class SecondThread extends Thread {

    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("SecondThread prints number: " + i);
        }
    }
}

public class ThreadEg {

    public static void main(String[] args) {
        Thread t1 = new Thread(new FirstThread());
        SecondThread t2 = new SecondThread();
        t1.start();
        t2.start();
    }
}
