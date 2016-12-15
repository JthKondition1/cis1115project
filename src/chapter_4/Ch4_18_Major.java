/*
 *Prompt user for 2 chars, return Student major and status. 
 */
package examples;

import java.util.Scanner;

/**
 * @author Jason Heyer
 */
public class Ch4_18_Major {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String mStat = input.nextLine();
        String fChar = mStat.substring(0, 1);
        String sChar = mStat.substring(1, 2);

        boolean isInvalid = false; 
        String answer = "";
        if (fChar.matches("m|M")) {
            answer = "Mathmatics ";
        }else if (fChar.matches("c|C")) {
            answer = "Computer Science ";
         }else if (fChar.matches("i|I")) {
            answer = "Information Technology ";
          }else {
            isInvalid = true;
          }

        //set boolean, check if true, return below :  
        if (sChar.equals("1")) {
            answer += "Freshman";
        } else if (sChar.equals("2")) {
            answer += "Sophmore";
        } else if (sChar.equals("3")) {
           answer += "Junior";
        } else if (sChar.equals("4")) {
            answer += "Senior";
        } else {
            isInvalid = true;
        }
        
        if(isInvalid){
            System.out.println("Invalid input");
        }else { 
            System.out.println(answer);
        } 
        
    }
}