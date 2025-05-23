
public class Inheritance {

    public static void main(String[] args) {
        System.out.println("Single-level Inheritance: ");
        Student s = new Student("Ajita", "Patandhoka", 5);
        s.display();
        s.info();
        System.out.println("\nMulti-level Inheritance: ");
        CollegeStudent cs = new CollegeStudent("Ram", "Bhaktapur", 7, "BCA");
        cs.display();
        cs.info();
        cs.College();
        System.out.println("\nHeirarchical Inheritance: ");
        Teacher t = new Teacher("Sachin", "Lalitpur", "Computer Science");
        t.display();
        t.course();
    }
}

class Person {

    String name, address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}

//Single-Level Inheritance
class Student extends Person {

    int roll;

    public Student(String name, String address, int roll) {
        super(name, address);
        this.roll = roll;
    }

    void info() {
        System.out.println(name + " lives in " + address);
    }
}

//Multi-Level Inheritance
class CollegeStudent extends Student {

    String major;

    public CollegeStudent(String name, String address, int roll, String major) {
        super(name, address, roll);
        this.major = major;
    }

    public void College() {
        System.out.println("Roll No.: " + roll);
        System.out.println(name + " is pursuing " + major + " and is from " + address);
    }
}

//Hierarchical Inheritance
class Teacher extends Person {

    String subject;

    public Teacher(String name, String address, String subject) {
        super(name, address);
        this.subject = subject;
    }

    public void course() {
        System.out.println("Prof." + name + " teaches " + subject + " and is from " + address);
    }
}
