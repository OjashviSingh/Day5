import java.util.*;
import java.util.Random;
public class SwapTwoNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st Number : ");
        int a = sc.nextInt();
        System.out.println("Enter the 2md Number : ");
        int b = sc.nextInt();
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("After swapping 1st number is "+a+" and 2nd number is "+b);
    }
}