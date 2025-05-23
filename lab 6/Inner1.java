//qsn 8

class Outer {

    private int data = 25;
    private static int num = 20;

    public class Inner {

        public void display() {
            System.out.println("Data: " + data);
        }
    }

    public static class StaticInner {

        public void display() {
            System.out.println("Number: " + num);
        }
    }
}

public class Inner1 {

    public static void main(String[] args) {
        Outer obj = new Outer();
        Outer.Inner inobj = obj.new Inner();
        inobj.display();
        Outer.StaticInner obj1 = new Outer.StaticInner();
        obj1.display();
    }
}
