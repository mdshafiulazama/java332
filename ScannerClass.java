import java.util.Scanner;
class ScannerClass
{
    public static void main(String [] args)
    {
        Scanner obj =new Scanner(System.in);
        System.out.print("Enter your name: ");
        String myname =obj.nextLine();
        System.out.println("My name is " +myname);
    }
}