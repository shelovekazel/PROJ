import javax.swing.JOptionPane;
public class PROJECT9 {
    public static void main(String[] args) {
        int[] temperatures = new int[25]; 
        int hotDays = 0;
        int pleasantDays = 0;
        int coldDays = 0;

        for (int i = 0; i < 25; i++) {//A for loop runs from 0 to 24 (25 iterations) to get the temperature for each day.
            String input = JOptionPane.showInputDialog("Enter temperature for day " + (i + 1) + ":");
            temperatures[i] = Integer.parseInt(input);
        }
        String output = ""; 
        for (int i = 0; i < 25; i++) {
            int temp = temperatures[i];
            String category;
            if (temp >= 85) {
                category = "Hot";
                hotDays++;
            } else if (temp >= 60) {
                category = "Pleasant";
                pleasantDays++;
            } else {
                category = "Cold";
                coldDays++;
            }
            output = output + "Temperature: " + temp + "°F - " + category + "\n"; 
        }

        output = output + "\nSummary:\n";
        output = output + "Hot days: " + hotDays + "\n";
        output = output + "Pleasant days: " + pleasantDays + "\n";
        output = output + "Cold days: " + coldDays;
        JOptionPane.showMessageDialog(null, output);
    }
}


