
package examples;

import java.util.Scanner; 

/**
 *
 * @author Jason Heyer
 */
public class P03N3_2addGame { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter sum of these 3 numbers... "); 
        
        int num1 = (int)Math.random()*100+1; 
        int num2 = (int)Math.random()*100+1; 
        int num3 = (int)Math.random()*100+1; 
        
        int number = input.nextInt(); 
        int answer = num1 + num2 + num3;
        System.out.print(num1 + "+" + num2 + "+" + num3 + "=" + answer + "is "
        + (num1 + num2 + num3 == answer) ); 
        
    
    }
    
}
