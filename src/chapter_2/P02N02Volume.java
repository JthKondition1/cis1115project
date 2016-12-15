
package chapter_2;

import java.util.Scanner;

/**
 * Problem 2 Number 2: Compute the volume of a cylinder. 
 * @author Jason Heyer
 */
public class P02N02Volume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
    
        System.out.print("Enter radius and length separated by a space: ");
        double radius = input.nextDouble(); 
        double length = input.nextDouble(); 
        
        double area = radius*radius*Math.PI; 
        double volume = area * length; 
       // System.out.println("The area is "+ area);
       //%s for string, %d for int, %f for double
       System.out.printf("%15s %20.4f\n", "The area is", area); // %15s = column will be 15 wide then a space (s for space) 
      // System.out.println("The volume is "+ volume);
       System.out.printf("%1s %2.4f\n", "The volume is", volume); // 
      
    }

    
}

//hw for Tues Sept 20: Figure out problem 2.3 and 2.5  (page 69, 70)