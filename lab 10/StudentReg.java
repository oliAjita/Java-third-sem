//qsn no 5:

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StudentReg implements ActionListener {

    JFrame f;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8;
    JTextField t1, t2, t3;
    JPasswordField p;
    JRadioButton r1, r2, r3;
    JCheckBox c1, c2, c3;
    JComboBox c;
    JButton b;
    JTextArea ta;

    public StudentReg() {
        f = new JFrame("Student Registration Form");
        l1 = new JLabel("Name");
        l2 = new JLabel("Address");
        l3 = new JLabel("E-mail");
        l4 = new JLabel("Password");
        l5 = new JLabel("Gender");
        l6 = new JLabel("Hobbies");
        l7 = new JLabel("Country");
        l8 = new JLabel("Student Info:");
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        t3 = new JTextField(20);
        p = new JPasswordField(15);
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        c1 = new JCheckBox("Sports");
        c2 = new JCheckBox("Crafts");
        c3 = new JCheckBox("Drawing");

        String[] country = {"Nepal", "Japan", "China"};
        c = new JComboBox(country);
        b = new JButton("Submit");
        ta = new JTextArea(15, 30);

        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        f.setLayout(new FlowLayout());
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(l4);
        f.add(p);
        f.add(l5);
        f.add(r1);
        f.add(r2);
        f.add(l6);
        f.add(c1);
        f.add(c2);
        f.add(c3);
        f.add(l7);
        f.add(c);
        f.add(b);
        f.add(l8);
        f.add(ta);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String name = t1.getText();
        String address = t2.getText();
        String email = t3.getText();
        String password = new String(p.getPassword());
        String gender = "";
        String hobby = "";
        String country1 = "";
        country1 = c.getItemAt(c.getSelectedIndex()).toString();
        if (r1.isSelected()) {
            gender = "Male";
        }
        if (r2.isSelected()) {
            gender = "female";
        }

        if (c1.isSelected()) {
            hobby += "Sports";
        }
        if (c2.isSelected()) {
            hobby += "Crafts";
        }
        if (c3.isSelected()) {
            hobby += "Drawing";
        }
        ta.setText("Name: " + name + "\nAddress: " + address + "\nE-mail: " + email + "\nPassword: " + password
                + "\nGender: " + gender + "\nHobbies: " + hobby + "\nCountry: " + country1);
    }

    public static void main(String[] args) {
        new StudentReg();
    }
}
