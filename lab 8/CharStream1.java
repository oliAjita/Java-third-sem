
package Lab8;

import java.io.*;
public class CharStream1 {
    public static void main(String[] args) throws Exception {
        // Read from bca.txt
        FileReader fr = new FileReader("bca.txt");
        // Write to copybca.txt
        FileWriter fwCopy = new FileWriter("copybca.txt");

        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);   // Print to console
            fwCopy.write(ch);              // Write to copybca.txt
        }
        System.out.println("\nFile copied successfully.");

        // Close resources
        fr.close();
        fwCopy.close();
    }
}
