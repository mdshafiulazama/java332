public class ParameterizedConstructor {

    public ParameterizedConstructor(String message) {
        System.out.println("the message: " + message);
    }

    public static void main(String[] args) {
        
        ParameterizedConstructor obj = new ParameterizedConstructor("Hi i am saikot !!!");
    }
}
