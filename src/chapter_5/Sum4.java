/*
 * Sum up test scores. Use -1 to end the data set. 
* @author heyerjt01 | Jason Heyer
 */
package examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sum4 {
    public static void main(String[] args) throws FileNotFoundException {
            Scanner input = new Scanner(new File("data.txt"));
        int sum = 0; 
        int myNum = input.nextInt(); 
        int count = 0;
        
        while(myNum >= 0){  
        count++;
        sum += myNum; 
        myNum = input.nextInt(); 
        
        }
        
        System.out.println("The sum is "+ sum);
    }
}
