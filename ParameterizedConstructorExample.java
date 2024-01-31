public class ParameterizedConstructorExample {

    // Parameterized constructor with two parameters
    public ParameterizedConstructorExample(String message1, String message2) {
        System.out.println("Parameterized constructor called with messages: " + message1 + " and " + message2);
    }

    public static void main(String[] args) {
        // Creating an instance of the class by providing values for the parameters
        ParameterizedConstructorExample obj = new ParameterizedConstructorExample("Hello", "World");
    }
}
