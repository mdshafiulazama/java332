public class NoArgumentsConstructorExample {

    // No-argument constructor
    public NoArgumentsConstructorExample() {
        System.out.println("No-argument constructor called.");
    }

    public static void main(String[] args) {
        // Creating an instance of the class will invoke the no-argument constructor
        NoArgumentsConstructorExample obj = new NoArgumentsConstructorExample();
    }
}
