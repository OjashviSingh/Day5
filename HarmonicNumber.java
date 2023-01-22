import java.util.*;
import java.util.Random;
public class HarmonicNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth number to print the Harmonic value of:");
        double userNumber = sc.nextInt();
        double i;
        double sum=0;
        for( i=1;i<=userNumber;i++)
        {
        sum=sum+(1/i);
        }
        System.out.println("Harmonic value of "+userNumber+" is "+sum);
        }
        }