/*
 * Sum up an unknown number of number.
 */
package examples;

import java.util.Scanner;

/**
 *
 * @author heyerjt01 | Jason Heyer
 */
public class Sum2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer = "y";
        int sum = 0;

        while (answer.matches("y|Y")) {
            System.out.print("Enter a number: ");
            int myNum = Integer.parseInt(input.nextLine()); //how to parse in ints to string, makes in a string variable cause we need a string from int
            sum = sum + myNum; // sum += myNum
            System.out.print("Another number?(y/n): ");
            answer = input.nextLine();
        }
        System.out.println("The sum is " + sum);
    }
}
