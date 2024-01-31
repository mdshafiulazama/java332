import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int value = scanner.nextInt();

        boolean isPrime = true;
        for (int i = 2; i * i <= value; i++) {
            if (value % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(value + " is " + (isPrime ? "prime" : "not prime"));
    }
}