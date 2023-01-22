import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        double a = scan.nextDouble();
        System.out.println("Enter the value of b: ");
        double b = scan.nextDouble();
        System.out.println("Enter the value of c: ");
        double c = scan.nextDouble();

        double x = b*b - 4*a*c;
        double y = (-b + (x/(2*a)));
        double z = (-b - (x/(2*a)));

        System.out.println("The roots of the equation are: " + y + " and " + z);
    }
}
