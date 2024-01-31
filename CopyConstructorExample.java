public class CopyConstructor1 {
    private String message;
    public CopyConstructor1(String message) {
        this.message = message;
    }
    public CopyConstructor1 CopyConstructor1(CopyConstructor1 otherObject) {
        CopyConstructorExample copiedObject = new CopyConstructorExample(otherObject.getMessage());
        return copiedObject;
    }
    public String getMessage() {
        return message;
    }
    public static void main(String[] args) {
        CopyConstructor1 originalObject = new CopyConstructor1("Hey Hi 1 !");
        CopyConstructor1 copiedObject = new CopyConstructor1("Hey hellow 2 !");
        copiedObject = copiedObject.CopyConstructor1(originalObject);
        System.out.println("Original Object Message: " + originalObject.getMessage());
        System.out.println("Copied Object Message: " + copiedObject.getMessage());
    }
}
