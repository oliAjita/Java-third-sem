
class Multiple extends Thread {

    public void run() {
        System.out.println("Name: " + Thread.currentThread().getName() + " and Priority: " + Thread.currentThread().getPriority());
    }
}

public class PriorityExample {

    public static void main(String[] args) {
        Multiple t1 = new Multiple();
        Multiple t2 = new Multiple();
        t1.setName("Thread1");
        t2.setName("Thread2");
        t1.setPriority(9);
        t2.setPriority(3);
        t1.start();
        t2.start();
    }
}
