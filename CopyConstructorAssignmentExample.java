public class CopyConstructorAssignmentExample {

    private String message;

    // Parameterized constructor
    public CopyConstructorAssignmentExample(String message) {
        this.message = message;
    }

    // Method to display the message
    public void displayMessage() {
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        // Creating an instance using the parameterized constructor
        CopyConstructorAssignmentExample originalObj = new CopyConstructorAssignmentExample("Original Message");
        
        // Creating another instance and assigning values from the original object
        CopyConstructorAssignmentExample copiedObj = new CopyConstructorAssignmentExample("");
        copiedObj.message = originalObj.message;

        // Displaying messages from both objects
        originalObj.displayMessage();
        copiedObj.displayMessage();
    }
}
