import java.util.Scanner;

public class HiLo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int theNumber = (int)(Math.random() * 100 + 1);
        System.out.println(theNumber);
    }
}
