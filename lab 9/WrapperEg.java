
public class WrapperEg {

    public static void main(String[] args) {
        //Autoboxing
        int x = 75;
        Integer num = x;
        System.out.println("Primitive x = " + x + "\nWrapper num= " + num);
        //Auto unboxing
        Integer n = new Integer(10);
        int number = n;
        System.out.println("wrapper integer= " + n + "\nPrimitive int= " + number);
    }
}
