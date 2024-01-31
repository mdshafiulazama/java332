import javax.swing.JOptionPane;

public class AddNumbers {
    public static void main(String[] args) {
        String num1String = JOptionPane.showInputDialog("Enter first number:");
        int num1 = Integer.parseInt(num1String);

        String num2String = JOptionPane.showInputDialog("Enter second number:");
        int num2 = Integer.parseInt(num2String);

        int sum = num1 + num2;
        JOptionPane.showMessageDialog(null, "Sum: " + sum);
    }
}
