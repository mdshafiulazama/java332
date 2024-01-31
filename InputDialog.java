import javax.swing.JOptionPane;

class DialogBox {
    public static void main(String[] args) {
        String num1, num2;
        int x, y;

        num1 = JOptionPane.showInputDialog("Enter a value: ");
        num2 = JOptionPane.showInputDialog("Enter another value: ");

        x = Integer.parseInt(num1);
        y = Integer.parseInt(num2);

        JOptionPane.showMessageDialog(null, "The sum is: " + (x + y));
    }
}
