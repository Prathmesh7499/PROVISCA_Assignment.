import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int rev = 0;
        do {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        } while (n != 0);
        System.out.println("Reversed: " + rev);
    }
}