// qsn no 2

import java.io.*;

public class CharStream {

    public static void main(String[] args) throws Exception {
        String data = "This is BCA third semester class";
        FileWriter fw = new FileWriter("bca.txt");
        fw.write(data);
        fw.close();
        System.out.println("File written successfully");

        //Read
        FileReader fr = new FileReader("bca.txt");
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }
        System.out.println();
        fr.close();
    }
}
