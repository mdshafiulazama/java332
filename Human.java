import javax.swing.JOptionPane;

public class Human {
    static String name = JOptionPane.showInputDialog("Enter name:");
    static String Age = JOptionPane.showInputDialog("Enter age:");
    static int age = Integer.parseInt(Age);

    static String message() {
        return "Name: " + name + "\n Age: " +age +" Y" ;
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, Human.message());
    }
}