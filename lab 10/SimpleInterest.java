
import javax.swing.*;

public class SimpleInterest {

    public static void main(String[] args) {
        double p = Double.parseDouble(JOptionPane.showInputDialog("Enter Principal"));
        double t = Double.parseDouble(JOptionPane.showInputDialog("Enter Time"));
        double r = Double.parseDouble(JOptionPane.showInputDialog("Enter Rate"));
        double si = ((p * t * r) / 100);
        JOptionPane.showMessageDialog(null, "Simple Interest: " + si);
    }
}
