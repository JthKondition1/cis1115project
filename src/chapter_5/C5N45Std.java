/*
 * Calculate Standard Deviation. 
 */
package examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author heyerjt01 | Jason Heyer
 */
public class C5N45Std {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("c5n45.txt"));
        int sum = 0;
        int n = 0;
        double avg = 0;
        double sumSquares = 0;
        double deviation = 0;

        while (input.hasNextInt()) {
            n++;
            int myNum = input.nextInt();
            sum += myNum;
            sumSquares = sumSquares + myNum * myNum;
        }
        
        deviation = Math.sqrt((sumSquares - ((double)sum * sum/n))/ (n-1));

        System.out.println("The sum is " + sum);
        System.out.println("The average is " + (double) sum / n);
        System.out.println("The sum of the squares is " + sumSquares);
        System.out.println("The deviation is "+ deviation);
    }
}
