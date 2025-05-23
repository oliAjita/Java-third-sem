
public class ExceptionEg {

    public static void main(String[] args) {
        try {
            int div = 10 / 0;
        } catch (ArithmeticException eg) {
            System.out.println("Exception = " + eg.getMessage());
        }

        //ArrayIndex
        try {
            int[] num = new int[3];
            System.out.println("Array element: " + num[3]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Exception = " + ex.getMessage());
        }

        //NumberFormat
        try {
            String s = "Java";
            int n = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("Exception = " + e);
        } finally {
            System.out.println("Finally block of code executed");
        }
    }
}
