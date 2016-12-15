package examples;

import java.util.Scanner;

/**
 * Algebra: solve quadratic equations.
 *
 * @author Jason Heyer
 */
public class P03N01SqRoots {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, and c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double e = (b * b) - (4 * a * c);
        double r1 = (-(b) + Math.pow((b * b) - (4 * a * c), 0.5)) / 2 * a;
        double r2 = (-(b) - Math.pow((b * b) - (4 * a * c), 0.5)) / 2 * a;
        if (e > 0) {
            System.out.printf("The equation has two roots: %.5f and %.5f%n", r1, r2);
        } else if (e == 0) {
            System.out.printf("The equation has one root: %.5f%n", r1);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }

}
