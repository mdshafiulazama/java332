
import java.util.Scanner;

public class Reversevalue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int value = scanner.nextInt();

        int reversed = 0;
        while (value != 0) {
            int remainder = value % 10;
            reversed = reversed * 10 + remainder;
            value /= 10;
        }

        System.out.println("Reversed value: " + reversed);
    }
}
