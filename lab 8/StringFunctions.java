// qsn no 

public class StringFunctions {

    public static void main(String[] args) {
        String str = "HelloWorld";

        System.out.println("Character at index 4: " + str.charAt(4));

        char[] arr = new char[5];
        str.getChars(0, 5, arr, 0);
        System.out.print("First 5 characters using getChars(): ");
        System.out.println(arr);

        char[] ch = str.toCharArray();
        System.out.print("All characters using toCharArray(): ");
        System.out.println(ch);

        String str1 = "helloworld";
        System.out.println("str equals str1: " + str.equals(str1));
        System.out.println("str equalsIgnoreCase str1: " + str.equalsIgnoreCase(str1));
        System.out.println("str compareTo str1: " + str.compareTo(str1));

        System.out.println("Substring (0,5): " + str.substring(0, 5));
        System.out.println("Concatenation: " + str.concat("Java"));
        System.out.println("Replacing: " + str.replace("Hello", "Java"));
    }
}
