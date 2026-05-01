import javax.swing.JOptionPane;

public class PROJECT3 {
    public static void main(String[] args) {
         int num = Integer.parseInt(JOptionPane.showInputDialog("Enter a positive decimal value:"));
        int choice = Integer.parseInt(JOptionPane.showInputDialog(
            "Convert to:\n1 â€“ Binary\n2 â€“ Octal\n3 â€“ Hexadecimal"));

        int base = 0;
        String system = "";

        if (choice == 1) {
            base = 2;
            system = "Binary";
        } else if (choice == 2) {
            base = 8;
            system = "Octal";
        } else if (choice == 3) {
            base = 16;
            system = "Hexadecimal";
        } else {
            JOptionPane.showMessageDialog(null, "Invalid choice!");
            return;
        }

        int[] array = new int[100];
        int i = 0;
        int temp = num;

        // Conversion process
        while (temp > 0) {
            array[i] = temp % base;
            temp = temp / base;
            i++;
        }

        String result = "";
        for (int j = i - 1; j >= 0; j--) {
            if (base == 16) {
                // handle hexadecimal digits manually
                if (array[j] == 10) result += "A";
                else if (array[j] == 11) result += "B";
                else if (array[j] == 12) result += "C";
                else if (array[j] == 13) result += "D";
                else if (array[j] == 14) result += "E";
                else if (array[j] == 15) result += "F";
                else result += array[j];
            } else {
                result += array[j];
            }
        }

        JOptionPane.showMessageDialog(null, num + " in " + system + " is " + result);
    }
    }



    