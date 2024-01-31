public class CopyConstructor1 {
    private String message;
    public CopyConstructor1(String message) {
        this.message = message;
    }
    public CopyConstructor1 CopyConstructor(CopyConstructor1 oObj) {
        CopyConstructor1 cObj = new CopyConstructor1(oObj.getMessage());
        return cObj;
    }
    public String getMessage() {
        return message;
    }
    public static void main(String[] args) {
        CopyConstructor1 oObj = new CopyConstructor1("Hey Hi 1 !");
        CopyConstructor1 cObj = new CopyConstructor1("");
        cObj = cObj.CopyConstructor(oObj);
        System.out.println("Message 1: " + oObj.getMessage());
        System.out.println("Message 2: " + cObj.getMessage());
    }
}
