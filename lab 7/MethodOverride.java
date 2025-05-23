
class Fruit {

    String name;
    String taste;
    String size;

    public Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    public void eat() {
        System.out.println(" " + name + " is " + size + " and tastes " + taste);
    }
}

class Apple extends Fruit {

    public Apple(String size) {
        super("Apple", "Sweet", size);
    }

    @Override
    public void eat() {
        System.out.println(" " + name + " is " + size + " and tastes " + taste);
    }
}

class Orange extends Fruit {

    public Orange(String size) {
        super("Orange", "Tangy", size);
    }

    @Override
    public void eat() {
        System.out.println(" " + name + " is " + size + " and tastes " + taste);
    }
}

public class MethodOverride {

    public static void main(String[] args) {
        Apple a1 = new Apple("medium");
        a1.eat();
        Orange o1 = new Orange("big");
        o1.eat();
    }
}
