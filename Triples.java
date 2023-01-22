import java.util.Scanner;

public class Triples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int n = scan.nextInt();
        int[] numbers = new int[n];

        System.out.print("Enter the integers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scan.nextInt();
        }

        int count = 0;
        System.out.println("Distinct triples that sum to 0:");
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if (numbers[i] + numbers[j] + numbers[k] == 0) {
                        count++;
                        System.out.println(numbers[i] + " " + numbers[j] + " " + numbers[k]);
                    }
                }
            }
        }
        System.out.println("Number of distinct triples that sum to 0: " + count);
    }
}
