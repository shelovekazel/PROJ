import javax.swing.*;
public class PROG7 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter a number:");
        int n = Integer.parseInt(input);

        int i = 2;//We want to check other divisors
        int temp = 0;
        while(i < n) { //Check divisors, Loop as long as i is less than the number
            if(n % i == 0) {// Check if divisible, If the remainder is 0 --- divisible
                temp = 1; // Mark as composite
                break;
            }
            i = i + 1;//Increment i to check next possible divisor
        }
        String result;
        if(n == 1) {
            result = "1 is neither prime nor composite";
        } else if(n == 2) {
            result = "2 is prime";
        } else if(temp == 1) {
            result = n + " is composite";
        } else {
            result = n + " is prime";
        }
        JOptionPane.showMessageDialog(null, result);
    }
}

/* 
Example:
10 % 2 = 0 → divisible ✔
10 % 3 = 1 → not divisible ✖
If divisible, then number is composite */

