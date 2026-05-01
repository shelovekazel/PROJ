import javax.swing.JOptionPane;

public class PROJECT1 {

    public static void createArithmeticSeq() {
        int first = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number:"));
        int diff = Integer.parseInt(JOptionPane.showInputDialog("Enter the common difference:"));

        int[] seq = new int[16]; //creatw arrray for 16 snum and store Arith seq

        for (int i = 0; i < seq.length; i++) {
            seq[i] = first + (diff * i); // formula
        }

        String output = "Arithmetic Sequence:\n";
        for (int i = 0; i < seq.length; i++) {
            output += seq[i] + "  ";
        }

        JOptionPane.showMessageDialog(null, output);
    }

    public static void main(String[] args) { //main method/entry point, gen then show reults
        createArithmeticSeq();
    }
}


