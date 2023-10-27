
import java.util.Scanner;

public class OddNumbersSum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of terms:");
        int n = input.nextInt();

        System.out.println("\nThe odd numbers are:");
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println(2 * i - 1);
            sum += 2 * i - 1;
        }

        System.out.println("\n\nThe Sum of odd Natural Number upto " + n + " terms is " + sum);

        input.close();
	}
}
