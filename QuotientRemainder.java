import java.util.*;
import java.util.Random;
public class QuotientRemainder {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dividend : ");
        int a = sc.nextInt();
        System.out.println("Enter the divisor : ");
        int b = sc.nextInt();
        System.out.println("Quotient is "+(a/b));
        System.out.println("Remainder is "+(a%b));
    }
}