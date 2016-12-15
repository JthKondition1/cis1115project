
package PreProjectJava;

import java.util.Scanner;

/**
 * Calculate the distance between two points.
 * @author Jason Heyer              
 */
public class P02N15TwoPoints {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        double x1, y1, x2, y2, distance;
        System.out.print("Enter two points (x1 y1 x2 y2): "); 
        x1=input.nextDouble();
        y1=input.nextDouble();
        x2=input.nextDouble();
        y2=input.nextDouble();
        
       // distance=Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y2),2));
        double xpart = Math.pow((x2-x1),2);
         double ypart = Math.pow((y2-y1),2);
         distance = Math.pow((xpart + ypart), y2); 
         
         //System.out.println("The distance is " +distance); 
         System.out.printf("The distance is %1.2f\n", distance);
    
         // + _ * / % 
    }
}
