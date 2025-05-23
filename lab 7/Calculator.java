
interface AddSub {

    int add();

    int sub();
}

interface MulDiv {

    int mul();

    int div();
}

class Calculation implements AddSub, MulDiv {

    int num1, num2;

    public Calculation() {
    }

    public Calculation(int a, int b) {
        num1 = a;
        num2 = b;
    }

    @Override

    public int add() {
        return (num1 + num2);
    }

    @Override

    public int sub() {
        return (num1 - num2);
    }

    @Override

    public int mul() {
        return (num1 * num2);
    }

    @Override

    public int div() {
        return (num1 / num2);
    }
}

public class Calculator {

    public static void main(String[] args) {
        Calculation c = new Calculation(9, 3);
        System.out.println("Addition = " + c.add());
        System.out.println("Subtraction= " + c.sub());
        System.out.println("Multiplication = " + c.mul());
        System.out.println("Division = " + c.div());
    }
}
