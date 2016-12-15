/*
 * Sum up test scores. Use -1 to end the data set. 
* @author heyerjt01 | Jason Heyer
 */
package examples;

import java.util.Scanner;

public class Sum3 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
        int sum = 0; 
        System.out.print("Enter a number(-1 to quit): ");
        int myNum = input.nextInt(); 
        int count = 0;
        
        while(myNum >= 0){  
        count++;
        sum += myNum; 
        System.out.print("Enter a number(-1 to quit): ");
        myNum = input.nextInt(); 
        
        }
        
        System.out.println("The sum is "+ sum);
    }
}
