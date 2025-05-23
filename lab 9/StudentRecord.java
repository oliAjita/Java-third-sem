// qsn no 3

import java.io.*;
import java.util.Scanner;

class Student implements Serializable {

    int roll;
    String name, address;
    long phone;

    public Student(int roll, String name, String address, long phone) {
        this.roll = roll;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
}

public class StudentRecord {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        Student[] std = new Student[5];
        FileOutputStream fout = new FileOutputStream("student.txt");
        ObjectOutputStream os = new ObjectOutputStream(fout);
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter information for student " + (i + 1));
            System.out.println("Roll No.: ");
            int roll = s.nextInt();
            System.out.println("Name: ");
            String name = s.next();
            System.out.println("Address: ");
            String address = s.next();
            System.out.println("Phone Number: ");
            long phone = s.nextLong();
            std[i] = new Student(roll, name, address, phone);
            os.writeObject(std[i]);
        }
        fout.close();
        os.close();
        System.out.println("File written successfully\n");
        FileInputStream fin = new FileInputStream("student.txt");
        ObjectInputStream oin = new ObjectInputStream(fin);
        Student dis[] = new Student[3];
        for (int i = 0; i < 3; i++) {
            dis[i] = (Student) oin.readObject();
            if (dis[i].address.equalsIgnoreCase("kritipur")) {
                System.out.println("Roll: " + dis[i].roll + "\t\tName: " + dis[i].name + "\tAddress: " + dis[i].address + "\tPhone: " + dis[i].phone);
            }
        }
        fin.close();
        oin.close();
    }
}
