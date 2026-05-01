import javax.swing.JOptionPane;

public class PROJECT6 {
    public static void main(String[] args) {

        int month = Integer.parseInt(JOptionPane.showInputDialog("Enter month (1-12):"));
        int day   = Integer.parseInt(JOptionPane.showInputDialog("Enter day:"));
        int year  = Integer.parseInt(JOptionPane.showInputDialog("Enter year:"));

        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) { // CHECK LEAP YEAR
            daysInMonth[1] = 29; //If leap year → February has 29 days.
        }
        int dayNumber = day;

        for (int i = 0; i < month - 1; i++) {
            dayNumber += daysInMonth[i];//Sum total days of earlier months
        }
        JOptionPane.showMessageDialog(null,
            "Day number of the year: " + dayNumber
        );
    }
}


