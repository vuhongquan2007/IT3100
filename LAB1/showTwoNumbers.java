import javax.swing.JOptionPane;

public class showTwoNumbers {
    public static void main(String args[]){
        String Num1, Num2;
        String showNotification = "You've just entered: ";
        Num1 = JOptionPane.showInputDialog(null, "Please enter the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        showNotification += Num1 + " and ";
        Num2 = JOptionPane.showInputDialog(null, "Please enter the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        showNotification += Num2;
        JOptionPane.showMessageDialog(null, showNotification, "Output", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
