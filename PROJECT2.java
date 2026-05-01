import javax.swing.JOptionPane;

public class PROJECT2 {

    public static void main(String[] args) {

        int[] num = new int[5];

        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(
                JOptionPane.showInputDialog("Enter number " + (i + 1) + ":")
            );
        }

        int highest = num[0];// assume first is highest
        int lowest = num[0];

        for (int i = 1; i < num.length; i++) {// find h &l
            if (num[i] > highest) {
                highest = num[i];
            }
            if (num[i] < lowest) {
                lowest = num[i];
            }
        }
        //bubble sort
        for (int i = 0; i < num.length - 1; i++) { //outer loop, controls how many passes we do through the array.
            for (int j = 0; j < num.length - 1 - i; j++) { //innerloop, comparing and swapping.
                if (num[j] > num[j + 1]) { //cpompare
                    int temp = num[j]; //swap, left=temp vsriable
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }

        String asc = "";
        String desc = "";

        for (int i = 0; i < num.length; i++) {
            asc += num[i] + "  ";
        }
        for (int i = num.length - 1; i >= 0; i--) {
            desc += num[i] + "  ";
        }

        String result = "Numbers Entered (Sorted):\n"
                + "\nLowest Number: " + lowest
                + "\nHighest Number  : " + highest
                + "\n\nAscending Order:\n" + asc
                + "\n\nDescending Order:\n" + desc;

        JOptionPane.showMessageDialog(null, result);
    }
}