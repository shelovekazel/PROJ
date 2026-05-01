import javax.swing.JOptionPane;

public class PROJECT5 {
    public static void main(String[] args) {

        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number:"));
        int original = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;    //Get last digit  
            reverse = reverse * 10 + digit;  //123 % 10 → 3, 0×10 + 3 = 3
            num = num / 10;               //Remove last digit from num  
        }

        if (original == reverse) {
            JOptionPane.showMessageDialog(null, original + " is a palindrome.");
        } else {
            JOptionPane.showMessageDialog(null, original + " is NOT a palindrome.");
        }
    }
}