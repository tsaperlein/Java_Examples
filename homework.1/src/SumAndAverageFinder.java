
import java.util.Scanner;

public class SumAndAverageFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 5 numbers:");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        double num4 = input.nextDouble();
        double num5 = input.nextDouble();

        double sum = num1 + num2 + num3 + num4 + num5;
        double average = sum / 5;

        System.out.println("The sum of 5 no is: " + sum);
        System.out.println("The Average is: " + average);

        input.close();
    }
}