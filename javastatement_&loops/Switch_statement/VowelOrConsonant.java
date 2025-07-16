import java.util.Scanner;
public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char c = sc.next().charAt(0);
        switch(Character.toLowerCase(c)) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
                System.out.println(c + " is a vowel"); break;
            default:
                System.out.println(c + " is a consonant");
        }
        sc.close();
    }
}