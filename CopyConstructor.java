public class copyconstructor {
    private String message;
    public copyconstructor(String message) {
        this.message = message;
    }
public copyconstructor(copyconstructor obj) {
        this(obj.message);
    }
    public void displayMessage() {
        System.out.println("Message: " + message);
    }
    public static void main(String[] args) {
       
        copyconstructor oObj = new copyconstructor("Hey !");
        copyconstructor cobj = new copyconstructor(oObj);
        System.out.println("Object 1:");
        oObj.displayMessage();
        System.out.println("\nObject 2:");
        cobj.displayMessage();
    }
}
