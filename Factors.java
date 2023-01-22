import java.util.Scanner;

public class Factors {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check its prime factors :");
        int number = sc.nextInt();
        System.out.println("The prime factors of "+number+" are :");
        for(int i = 2; i< number; i++) {
            while(number%i == 0) {
                System.out.println(i);
                number = number/i;
            }
        }
        if(number >2) {
            System.out.println(number);
        }
    }
}
