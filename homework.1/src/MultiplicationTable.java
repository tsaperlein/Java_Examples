
import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.println("Enter the number:");
        int number = input.nextInt();

        System.out.println("Enter the number of terms:");
        int terms = input.nextInt();

        System.out.println("\n");
        for (int i = 0; i <= terms; i++) {
            System.out.println(number + " X " + i + " = " + number * i);
        }

        input.close();

	}

}
