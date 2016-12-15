/*
 * Sum up test scores. Use eof(). 
* @author heyerjt01 | Jason Heyer
 */
package examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sum5 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("data2.txt"));
        int sum = 0;
        int count = 0;

        while (input.hasNextInt()) {
            count++;
            int myNum = input.nextInt();
            sum += myNum;
        }

        System.out.println("The sum is " + sum);
        System.out.println("The average is " + (double) sum / count);
    }
}
