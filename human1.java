import javax.swing.JOptionPane;

public class human1 {
    String name;
    int age;

    public human1() {
        this.name = JOptionPane.showInputDialog("Enter name:");
        String ageStr = JOptionPane.showInputDialog("Enter age:");
        this.age = Integer.parseInt(ageStr);
    }

    String message() {
        return "Name: " + name + ", Age: " + age;
    }

    public static void main(String[] args) {
        human1 person = new human1();
        JOptionPane.showMessageDialog(null, person.message());
    }
}