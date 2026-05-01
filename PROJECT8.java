import javax.swing.JOptionPane;

public class PROJECT8 {
    public static void main(String[] args) {
        String inputA = JOptionPane.showInputDialog("Enter first integer:");
        int a = Integer.parseInt(inputA);

        String inputB = JOptionPane.showInputDialog("Enter second integer:");
        int b = Integer.parseInt(inputB);

        int x = a;//ex. 24
        int y = b;//18

        while (y != 0) { //Keep looping as long as y is not zero. When y becomes 0 then stop
            int gcd = y;
            y = x % y; // y becomes remainder of x divided by y //y=6
            x = gcd; 
        }

        JOptionPane.showMessageDialog(null,
                "GCD of " + a + " and " + b + " is: " + x);
    }
}



