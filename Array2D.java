import java.util.Scanner;
import java.io.PrintWriter;

public class Array2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PrintWriter output = new PrintWriter(System.out);

        int rows = input.nextInt();
        int columns = input.nextInt();
        int[][] array = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                output.print(array[i][j] + " ");
            }
            output.println();
        }
        output.close();
    }
}
