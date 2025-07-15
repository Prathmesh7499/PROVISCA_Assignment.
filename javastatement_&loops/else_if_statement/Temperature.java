import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        if (temp < 0) System.out.println("Freezing Cold");
        else if (temp < 20) System.out.println("Cold");
        else if (temp < 30) System.out.println("Warm");
        else System.out.println("Hot");
    }
}