// qsn 1

class Circle {

    float radius;
    final double PI = 3.1415;

    public Circle() {
    }

    public Circle(float r) {
        radius = r;
    }

    public double findArea() {
        return (PI * radius * radius);
    }

    public double findCircumference() {
        return (2 * PI * radius);
    }
}

public class MyCircle {

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(7);

        double a1 = c1.findArea();
        double cr1 = c1.findCircumference();
        System.out.println("Circle1 : Area = " + a1 + "\nCircumference = " + cr1);

        double a2 = c2.findArea();
        double cr2 = c2.findCircumference();
        System.out.println("Circle1 : Area = " + a2 + "\nCircumference = " + cr2);
    }
}
