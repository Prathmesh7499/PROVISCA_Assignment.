import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter op (+,-,*,/): ");
        char o = sc.next().charAt(0);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        switch (o) {
            case '+': System.out.println("Sum = " + (a + b)); break;
            case '-': System.out.println("Diff = " + (a - b)); break;
            case '*': System.out.println("Prod = " + (a * b)); break;
            case '/': System.out.println("Quot = " + (a / b)); break;
            default: System.out.println("Invalid op");
        }
        sc.close();
    }
}