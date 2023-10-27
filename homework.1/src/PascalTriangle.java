
import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.println("Input number of rows:");
        int rows = input.nextInt();

        for (int i = 0; i < rows; i++) {
            int number = 1;
            System.out.printf("%" + (rows - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
        input.close();
	}
}