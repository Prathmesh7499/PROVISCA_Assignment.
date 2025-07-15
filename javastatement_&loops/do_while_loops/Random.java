public class Random {
    public static void main(String[] args) {
        int num;
        do {
            num = (int)(Math.random() * 10);
            System.out.println("Random: " + num);
        } while (num != 0);
        System.out.println("Generated zero, exiting.");
    }
}