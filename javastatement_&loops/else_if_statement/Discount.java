import java.util.Scanner;
public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        if (amount >= 1000) System.out.println("20% Discount");
        else if (amount >= 500) System.out.println("10% Discount");
        else System.out.println("No Discount");
    }
}