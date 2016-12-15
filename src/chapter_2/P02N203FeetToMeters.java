package chapter_2;

import java.util.Scanner;

/**
 *
 * @author Jasono Heyer
 */
public class P02N203FeetToMeters {
   public static void main(String[] args) { 
       Scanner input = new Scanner(System.in); 
   
        System.out.print("Enter a value for feet: "); 
        double feet = input.nextDouble(); 
        double meters = feet*.305; 
        System.out.print(feet);
        System.out.print(" feet is " + meters); 
        
   }

}