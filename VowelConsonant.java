import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char letter = scanner.next().charAt(0);

        boolean isVowel = (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ||
                           letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U');

        System.out.println(letter + " is " + (isVowel ? "a vowel" : "a consonant"));
    }
}