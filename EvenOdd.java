import java.util.*;
import java.util.Random;
public class EvenOdd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if its even or odd :");
        int a = sc.nextInt();
        if (a > 0) {
            if (a % 2 == 0)
                System.out.println(a + " is an even number.");
            else if (a % 2 != 0)
                System.out.println(a + " is an odd number.");
            else
                System.out.println("Please enter a valid number.");
        }
        else
            System.out.println("Please enter a number greater than 0.");
    }
}