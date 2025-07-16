import java.util.Scanner;
public class UserLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Username: ");
        String user = sc.nextLine();
        System.out.print("Password: ");
        String pass = sc.nextLine();
        if ("admin".equals(user) && "admin123".equals(pass))
            System.out.println("Login successful");
        else
            System.out.println("Login failed");
        sc.close();
    }
}