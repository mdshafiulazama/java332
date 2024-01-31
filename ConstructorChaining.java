public class ConstructorChaining {
    private String message;
    public ConstructorChaining() {
        this("Message 1 start");
    }
    public ConstructorChaining(String message) {
        this.message = message;
        System.out.println("message 1: " + message + " here !");
    }
    public String getMessage() {
        return message;
    }
    public static void main(String[] args) {
        ConstructorChaining dObj = new ConstructorChaining();
        System.out.println("Message 2: " + dObj.getMessage());
    }
}
