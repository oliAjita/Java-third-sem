
public class Recursion {

    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return (n * fact(n - 1));
        }
    }

    public static int fibo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return (fibo(n - 1) + fibo(n - 2));
        }
    }

    public static void main(String[] args) {
        int num = 5;
        int term = fibo(num);
        int factorial = fact(num);
        System.out.println("Factorial of " + num + " is " + factorial);
        System.out.println("Fibonacci term " + num + " is : " + term);
    }

}
