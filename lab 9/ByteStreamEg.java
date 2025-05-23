// qsn no 1

import java.io.*;

public class ByteStreamEg {

    public static void main(String[] args) throws Exception {
        String data = "Java is object oriented programming";
        byte[] bytedata = data.getBytes();
        FileOutputStream fout = new FileOutputStream("java.txt");
        fout.write(bytedata);
        fout.close();
        System.out.println("File written successfully");

        FileInputStream fin = new FileInputStream("java.txt");
        int ch;
        int vowel = 0;
        while ((ch = fin.read()) != -1) {
            char c = (char) ch;
            System.out.print(c);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                vowel++;
            }
        }
        fin.close();

        System.out.println("\nTotal number of vowels: " + vowel);
    }
}
