package examples;

import java.util.Scanner;

/**
 * Example to calculate BMI.
 *
 * @author Jason Heyer
 */
public class P03N3_6BMI {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight: ");
        double weight = input.nextDouble();
        
        System.out.print("Enter feet: ");
        double feet = input.nextDouble();

        System.out.print("Enter inches: ");
        double inches = input.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        double lbsToKilo = weight * KILOGRAMS_PER_POUND;
        double inToMeter = ((feet*12)+inches) * METERS_PER_INCH;

        double bmi = lbsToKilo / (inToMeter * inToMeter);

        System.out.println("BMI is: " + bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else { 
            System.out.println("Obese");
        }
    }

}
