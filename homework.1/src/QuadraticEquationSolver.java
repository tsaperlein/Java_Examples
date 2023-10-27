import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the coefficients a, b, and c of the quadratic equation ax^2 + bx + c = 0");
        System.out.println("Input a:");
        double a = input.nextDouble();
        System.out.println("Input b:");
        double b = input.nextDouble();
        System.out.println("Input c:");
        double c = input.nextDouble();

        double discriminant = Math.pow(b, 2) - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("The roots are " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);

            System.out.println("The root is " + root);
        } else {
            System.out.println("The equation has no real roots");
        }

        input.close();
    }
}