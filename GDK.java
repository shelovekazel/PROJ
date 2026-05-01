import javax.swing.*;

public class GDK {
    public static void main(String[] args) {
        int total = 0;
        int aCount = 0, bCount = 0, cCount = 0, dCount = 0, fCount = 0;
        int score;

        while (true) {
            String input = JOptionPane.showInputDialog("Enter exam score (negative number to stop):");

            if (input == null) {
                break; // user clicked cancel
            }

            input = input.trim();
            if (input.isEmpty()) {
                continue;
            }

            score = Integer.parseInt(input);

            // Sentinel value check
            if (score < 0) {
                break;
            }

            if (score <= 100) {
                total++;

                if (score >= 90) {
                    aCount++;
                } else if (score >= 80) {
                    bCount++;
                } else if (score >= 70) {
                    cCount++;
                } else if (score >= 60) {
                    dCount++;
                } else {
                    fCount++;
                }
            }
        }

        String result = "Total number of grades = " + total
                + "\nNumber of A’s = " + aCount
                + "\nNumber of B’s = " + bCount
                + "\nNumber of C’s = " + cCount
                + "\nNumber of D’s = " + dCount
                + "\nNumber of F’s = " + fCount;

        JOptionPane.showMessageDialog(null, result);
    }
}
