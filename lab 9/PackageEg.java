
import java.util.*;

public class PackageEg {

    public static void main(String[] args) {
        //Vector
        System.out.println("Vector class: ");
        Vector v = new Vector();
        v.add(2);
        v.add(87);
        v.add(99);
        v.add(34);
        System.out.println("Vector elements: " + v);
        System.out.println("Total elements in v= " + v.size());
        System.out.println("Value at index 3 = " + v.get(3));
        System.out.println("Index of 45: " + v.indexOf(45));
        v.removeAllElements();
        System.out.println("Vector elements: " + v);

        //Stack
        System.out.println("\nStack class: ");
        Stack s = new Stack();
        s.push(17);
        s.push(65);
        s.push(39);
        s.push(83);
        s.push(67);
        System.out.println("Stack elements: " + s);
        s.pop();
        System.out.println("Stack elements: " + s);
        System.out.println("Element index: " + s.search(67));
        System.out.println("Top of the stack: " + s.peek());

        //HashTable
        System.out.println("\nHashtable class: ");
        Hashtable ht = new Hashtable();
        ht.put(201, "DSA");
        ht.put(202, "Statistics");
        ht.put(203, "System Analysis and Design");
        ht.put(204, "OOP in Java");
        ht.put(205, "Web Technology");
        System.out.println("Total elements in Hashtable: " + ht.size());
        System.out.println(ht);
        System.out.println("Value of ht at key 202: " + ht.get(202));
        ht.remove(202);
        System.out.println(ht);
        ht.clear();
        System.out.println(ht);

        //Random
        System.out.println("\nRandom class: ");
        Random r = new Random();
        //Integer
        int r1 = r.nextInt(15);
        int r2 = r.nextInt(20, 30);
        System.out.println("First random integer number:  " + r1 + "\t\tSecond random integer number: " + r2);
        //Double
        double rd1 = r.nextDouble();
        System.out.println("Double random first number: " + rd1);
        //Boolean
        boolean rb = r.nextBoolean();
        System.out.println("Boolean number: " + rb);
    }
}
