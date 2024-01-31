import javax.swing.JOptionPane;

public class Humann {
    String name;
    int age;

    public Humann() {
        this.name = JOptionPane.showInputDialog("Enter name:");
        String ageStr = JOptionPane.showInputDialog("Enter age:");
        this.age = Integer.parseInt(ageStr);
    }

    String message() {
        return "Name: " + name + "\n Age: " + age+" Y";
    }

    public static void main(String[] args) {
        Humann person = new Humann();
        JOptionPane.showMessageDialog(null, person.message());
    }
}