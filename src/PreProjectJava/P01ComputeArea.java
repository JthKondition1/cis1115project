package PreProjectJava;

import java.util.Scanner;

/**
 *
 * @author Jason Heyer
 */


public class P01ComputeArea { 
    
    public static void main(String[] args) { //psvm + Ctrl-spacebar OR Tab
        Scanner input = new Scanner(System.in);
        
        double radius; 
        double area; 
        
        System.out.print("Enter the radius: ");// sout + Ctrl-spacebar OR Tab 
        radius = input.nextDouble();
        
        area = radius*radius*Math.PI; 
        
        System.out.println("The area for the circle of radius "
                + radius + " is " + area +".");
    }
}
 