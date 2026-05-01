import javax.swing.JOptionPane;

public class PROJECT4 {
    public static void main(String[] args) {

        double side1 = Double.parseDouble(JOptionPane.showInputDialog("Enter side 1:"));

        double side2 = Double.parseDouble(JOptionPane.showInputDialog("Enter side 2:"));

        double side3 = Double.parseDouble(JOptionPane.showInputDialog("Enter side 3:"));

        String result;
        if (side1 == side2 && side2 == side3) {
            result = "Triangle is Equilateral";
        } 
        else if (side1 == side2 || side1 == side3 || side2 == side3) {
            result = "Triangle is Isosceles";
        } 
        else {
            result = "Triangle is Scalene";
        }
        JOptionPane.showMessageDialog(null, result);
    }
}


