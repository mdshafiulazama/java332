public class ConstructorChaining {
    private String message;
    public ConstructorChaining() {
        this("Default Message");
    }
    public ConstructorChaining(String message) {
        this.message = message;
        System.out.println("Constructor with message: " + message + " called");
    }
    public String getMessage() {
        return message;
    }
    public static void main(String[] args) {
        ConstructorChaining dOb = new ConstructorChaining();
        System.out.println("Object Message: " + dtObj.getMessage());
    }
}
