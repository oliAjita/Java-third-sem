
class Sync {

    public synchronized void display() {
        try {
            System.out.println("Java is ");
            Thread.sleep(5000);
            System.out.println("object-oriented programming");
        } catch (Exception ex) {
        }
    }
}

class Thread1 extends Thread {

    Sync obj;

    public Thread1(Sync obj) {
        this.obj = obj;
    }

    public void run() {
        obj.display();
    }
}

public class SyncEx {

    public static void main(String[] args) {
        Sync str = new Sync();
        Thread t1 = new Thread1(str);
        Thread t2 = new Thread1(str);
        t1.start();
        t2.start();
    }
}
