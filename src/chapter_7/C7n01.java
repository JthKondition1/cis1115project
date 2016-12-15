/*
 * Jason Heyer || heyerjt01
 */
package Arrays;

import java.util.Scanner;

public class C7n01 {

    public static void main(String[] args) {
        // Prompt for scores
        Scanner input = new Scanner(System.in);
        System.out.print("How many scores: ");
        int n = input.nextInt();
        // Start array | read in data
        int[] myNums = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter score: ");
            myNums[i] = input.nextInt();                                        // accumulator | evaluator 
        }
        int best = myNums[0];
        for (int i = 0; i < n; i++) {                                           // for loop here almost always starts at 0 | 
            if (myNums[i] > best) {                                             //
                best = myNums[i];
            }

        }
        System.out.println("The best score is " + best);
 
        for (int i = 0; i < n; i++) {                     
            if (myNums[i] >= best - 10) {                                       // Evaluate scores
                System.out.println(myNums[i] + " is an A");
            }
            else if (myNums[i] >= best - 20) {
                System.out.println(myNums[i] + " is an B");
            }
            else if (myNums[i] >= best - 30) {
                System.out.println(myNums[i] + " is an C");
            }
            else if (myNums[i] >= best - 40) {
                System.out.println(myNums[i] + " is an D");
            }
            else{
                System.out.println(myNums[i] + " is an F");
            }
        }
    }
}
