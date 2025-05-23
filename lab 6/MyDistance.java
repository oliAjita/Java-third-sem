//qsn no 4

class Distance {

    private int feet, inches;

    public Distance(int f, int i) {
        feet = f;
        inches = i;
    }

    Distance addDistance(Distance d) {
        return new Distance(feet + d.feet, inches + d.inches);
    }

    void display() {
        System.out.println(feet + " feet " + inches + " inches");
    }
}

public class MyDistance {

    public static void main(String[] args) {
        Distance d1 = new Distance(8, 2);
        Distance d2 = new Distance(6, 11);
        Distance d3 = d1.addDistance(d2);
        System.out.println("Distance1 : ");
        d1.display();
        System.out.println("Distance2 : ");
        d2.display();
        System.out.println("Total Distance : ");
        d3.display();
    }
}
