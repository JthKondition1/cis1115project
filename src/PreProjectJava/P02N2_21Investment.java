
package PreProjectJava;

import java.util.Scanner;

/**
 *
 * @author 55heyerjt01
 */
public class P02N2_21Investment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Input investment amount, annual interest rate, "
                + "and number of years separated by a space : "); 
        double invAmount = input.nextDouble();
        double annInt = input.nextDouble();
        double years = input.nextDouble();
        
       
        double fiv1 = invAmount;
        double fiv2 = Math.pow((1+annInt/100/12), years*12); // 1000 3.25 1 = 1032.98
        
        double futureInvVal = fiv1 * fiv2; 
        System.out.printf("Accumulated value is %2.2f\n", futureInvVal);
    }
}
