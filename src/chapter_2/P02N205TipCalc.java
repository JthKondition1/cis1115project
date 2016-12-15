
package chapter_2;

import java.util.Scanner;

/**
 * Program a tip calculator.
 * @author Jason Heyer
 */
public class P02N205TipCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the subtotal and a gratuity rate: "); 
        double subTotal = input.nextDouble(); 
        double gratRate = input.nextDouble(); 
        
        double grat = subTotal * (gratRate*.1); 
        double total = subTotal + grat; 
        
        System.out.print("The gratuity is " + grat);
        System.out.print(" and the total is "+ total);
    }
} 
