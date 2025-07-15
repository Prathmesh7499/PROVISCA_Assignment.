import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Hello\n2. World\n0. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> System.out.println("Hello");
                case 2 -> System.out.println("World");
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice");
            }
        } while (choice != 0);
    }
}