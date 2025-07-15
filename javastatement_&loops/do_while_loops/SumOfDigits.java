import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        do {
            sum += num % 10;
            num /= 10;
        } while (num > 0);
        System.out.println("Sum of digits: " + sum);
    }
}