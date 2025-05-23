
import java.util.Scanner;

class BalanceException extends Exception {

    public BalanceException(String msg) {
        super(msg);
    }
}

public class CustomException {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the amount: ");
            double balance = sc.nextInt();
            System.out.println("Enter withdrawal amount: ");
            double withdraw = sc.nextInt();
            if (balance > withdraw) {
                balance = balance - withdraw;
                System.out.println("Remaining balance: " + balance);
            } else {
                throw (new BalanceException("Insufficient balance"));
            }
        } catch (BalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
