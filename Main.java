public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = 8;
        int d = 0; 

        if (a >= b && a >= c) {
            System.out.println("The largest num=" + a);
            d = Math.abs(a - Math.max(b, c));
        } else if (b >= a && b >= c) {
            System.out.println("The largest num=" + b);
            d = Math.abs(b - Math.max(a, c));
        } else {
            System.out.println("The largest num=" + c);
            d = Math.abs(c - Math.max(a, b));
        }

        System.out.println("The difference between the two highest numbers=" + d);
    }
}