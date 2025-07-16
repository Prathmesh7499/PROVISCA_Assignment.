public class Vowel {
    public static void main(String[] args) {
        char ch = 'E';
        if ("AEIOUaeiou".indexOf(ch) != -1)
            System.out.println(ch + " is a vowel");
        else
            System.out.println(ch + " is not a vowel");
    }
}