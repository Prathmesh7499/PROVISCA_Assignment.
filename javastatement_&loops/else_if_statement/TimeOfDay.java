import java.util.Scanner;
public class TimeOfDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        if (hour < 12) System.out.println("Morning");
        else if (hour < 17) System.out.println("Afternoon");
        else if (hour < 21) System.out.println("Evening");
        else System.out.println("Night");
    }
}