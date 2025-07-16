import java.util.Scanner;
public class PasswordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String pass = sc.nextLine();
        if ("secret".equals(pass)) System.out.println("Correct password");
        else System.out.println("Incorrect password");
        sc.close();
    }
}