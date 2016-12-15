package examples;

import java.util.Random;
import java.util.Scanner;

/**
 * Calculate the cost of shipping by weight (in lbs).
 *
 * @author Jason Heyer
 */
public class P03N3_18ShippingCost {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();

        System.out.print("Enter weight of package: ");
        int weight = input.nextInt();

        if (weight > 50) {
            System.out.println("The package cannot be shipped.");
        } else if (weight <= 50 && weight > 30) {
            System.out.println("Estimated shipping cost is: $18.50");
        } else if (weight <= 30 && weight > 20) {
            System.out.println("Estimated shipping cost is: $15.50");
        } else if (weight <= 20 && weight > 10) {
            System.out.println("Estimated shipping cost is: $10.50");
        } else if (weight <= 10 && weight > 3) {
            System.out.println("Esitmated shipping cost is: $8.50");
        } else if (weight <= 3 && weight > 1) {
            System.out.println("Esitmated shipping cost is: $5.50");
        } else {
            System.out.println("Esitmated shipping cost is: $3.50");
        }
    } 
}
