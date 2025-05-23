// qsn 6 (a)

public class ValueCall {

    public static void main(String[] args) {
        int num = 30;
        System.out.println("Before call: Number: " + num);
        increment(num);
        System.out.println("After call: Number: " + num);
    }

    public static void increment(int n) {
        n = n + 10;
        System.out.println("Value of n= " + n);
    }
}
