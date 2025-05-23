//Qsn no 3

class Box {

    int width, height, depth;

    public Box() {
    }

    public Box(int w, int h, int d) {
        width = w;
        height = h;
        depth = d;
    }

    public int volume() {
        return (width * height * depth);
    }

    public int surface() {
        int a = 2 * (height * width + width * depth + depth * height);
        return a;
    }
}

public class Check {

    public static void main(String[] args) {
        Box b1 = new Box(10, 12, 9);
        Box b2 = new Box(6, 18, 10);
        int v = b1.volume();
        int sa = b1.surface();
        System.out.println("Box1: Volume = " + v + "\nSurface Area = " + sa);

        int v1 = b2.volume();
        int sa1 = b2.surface();
        System.out.println("Box2: Volume = " + v1 + "\nSurface Area = " + sa1);
    }
}
