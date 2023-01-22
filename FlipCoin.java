import java.util.*;
import java.util.Random;
public class FlipCoin {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many times you want to flip a coin.");
        int userNumber = sc.nextInt();
        float heads = 0;
        float tails = 0;
        if (userNumber>0) {
            for (int i = 1; i <= userNumber; i++) {
                double c = Math.random();
                if (c <= 0.5)
                    heads += 1;
                else
                    tails += 1;
            }
            System.out.println("Number of times heads occurs is: " + heads);
            System.out.println("Number of times tails occurs is: " + tails);
            float per = (heads / userNumber) * 100;
            System.out.println("Percentage of heads is " + per + " and tails is " + (100 - per));
        }else
            System.out.println("Please enter a number greater than 0.");
    }
}
