import javax.swing.JOptionPane;

public class helloNameDialog{
    public static void main(String args[]){
        String input = JOptionPane.showInputDialog("Please enter your name: ");
        JOptionPane.showMessageDialog(null, "Hi " + input + "!");
        System.exit(0);
    }
}
