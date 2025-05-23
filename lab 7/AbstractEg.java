
abstract class Shape {

    double dim1, dim2;

    public Shape() {
    }

    public Shape(double d1, double d2) {
        dim1 = d1;
        dim2 = d2;
    }

    public abstract double area();
}

class Rectangle extends Shape {

    public Rectangle(double l, double b) {
        super(l, b);
    }

    @Override
    public double area() {
        return (dim1 * dim2);
    }
}

public class AbstractEg {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 7);
        System.out.println("Area of rectangle: " + r.area());
    }
}
