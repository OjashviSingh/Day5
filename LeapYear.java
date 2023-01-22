import java.util.*;
import java.util.Random;
public class LeapYear {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year to check:");
        int userNumber = sc.nextInt();
        int copyNumber = userNumber;
        int count = 0;
        while (copyNumber != 0) {
            copyNumber = copyNumber / 10;
            count += 1;
        }
        if (count == 4) {
            if (userNumber % 100 == 0 && userNumber % 400 != 0)
                System.out.println(userNumber + " is not a leap year.");
            else if (userNumber % 4 == 0)
                System.out.println(userNumber + " is a leap year.");
            else
                System.out.println(userNumber + " is not a leap year.");
        }
        else
            System.out.println("Please enter a 4 digit year.");
    }
}