package examples;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jason Heyer
 */
public class Ch03N3_15_Lotto {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random(); 
        
        System.out.print("Enter a 3 digit number: ");
        int number = input.nextInt(); //User input number

        int digit1 = number / 100;
        int digit2 = number % 100 / 10;
        int digit3 = number % 10;
        
         int compNum = rand.nextInt(999-100+1)+100;
         int compD1 = compNum /100; 
         int compD2 = compNum % 100/ 10;
         int compD3 = compNum % 10; 
         
        System.out.print("N: " + number + " d1: "
                + digit1 + " d2: " + digit2 + " d3: " + digit3 + " Comp#: " +compNum /*+ " Comp D: " + compD3*/); //TEST  
        if (number == compNum){
            System.out.println("$10,000$ WINNER!!!!!!!!!");
        }
        else if (digit1 == compD1
                || digit1 == compD2
                || digit1 == compD3
                && digit2 == compD1
                || digit2 == compD2
                || digit2 == compD3
                && digit3 == compD1
                || digit3 == compD2
                || digit3 == compD3){
            System.out.println("$3,000$ WINNER!!! 3 Digit Match!!!"); 
        } else if (digit1 == compD1
                || digit1 == compD2
                || digit1 == compD3
                || digit2 == compD1
                || digit2 == compD2
                || digit2 == compD3
                || digit3 == compD1
                || digit3 == compD2
                || digit3 == compD3){
            System.out.println("$1,000$ WINNER!!! 1 or 2 Digit Match!!!"); 
        } else { 
            System.out.println("Sorry, no match!");
        }
    }
}
