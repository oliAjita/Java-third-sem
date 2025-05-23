// qsn no 2

class Student {

    int roll;
    String name, address;

    public Student() {
    }

    public Student(int r, String n, String a) {
        roll = r;
        name = n;
        address = a;
    }

    public void display() {
        System.out.println("Student Information: ");
        System.out.println("Roll = " + roll + "\nName = " + name + "\nAddress = " + address);
    }
}

public class info {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
        Student s2 = new Student(10, "Ajita", "Lalitpur");
        s2.display();
    }
}
