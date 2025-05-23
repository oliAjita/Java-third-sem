// qsn 7

class Increment {

    private static int num = 10;

    public static void Incrementer() {
        num++;
    }

    public static int getNumber() {
        return num;
    }
}

public class Static {

    public static void main(String[] args) {
        System.out.println("Number: " + Increment.getNumber());
        Increment.Incrementer();
        System.out.println("Number after incrementing: " + Increment.getNumber());
    }
}
