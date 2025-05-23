
class Shape {

    double dim1, dim2;

    public Shape(double d1, double d2) {
        dim1 = d1;
        dim2 = d2;
    }

    public double area() {
        System.out.println("Undefined");
        return 0.0;
    }
}

class Rectangle extends Shape {

    public Rectangle(double l, double b) {
        super(l, b);
    }

    @Override
    public double area() {
        return (super.dim1 * super.dim2);
    }
}

class Triangle extends Shape {

    public Triangle(double b, double h) {
        super(b, h);
    }

    @Override
    public double area() {
        return (0.5 * super.dim1 * super.dim2);
    }
}

public class MethodOverride1 {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(4, 7);
        double ar = r.area();
        System.out.println("Area of rectangle: " + ar);
        Triangle t = new Triangle(11, 15);
        double at = t.area();
        System.out.println("Area of triangle: " + at);
    }
}
