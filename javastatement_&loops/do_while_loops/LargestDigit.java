import java.util.Scanner;
public class LargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int max = 0;
        do {
            int digit = num % 10;
            if (digit > max) max = digit;
            num /= 10;
        } while (num > 0);
        System.out.println("Largest digit: " + max);
    }
}