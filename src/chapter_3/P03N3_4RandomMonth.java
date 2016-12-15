package examples;

import java.util.Random;
import java.util.Scanner;

/**
 * Randomly generate an integer between 1 and 12 and display the English 
 * month name January, February, ..., December for the number
 * 1, 2, ..., 12, accordingly.
 * @author Jason Heyer
 */
public class P03N3_4RandomMonth {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        int Num = (int)(Math.random()*12);
        
        switch (Num) { 
            case 0: System.out.println((Num+1)+" is for month: January."); break;
            case 1: System.out.println((Num+1)+" is for month: February.");break;
            case 2: System.out.println((Num+1)+" is for month: March.");  break;
            case 3: System.out.println((Num+1)+" is for month: April."); break;
            case 4: System.out.println((Num+1)+" is for month: May.");  break;
            case 5: System.out.println((Num+1)+" is for month: June."); break;
            case 6: System.out.println((Num+1)+" is for month: July.");break;
            case 7: System.out.println((Num+1)+" is for month: August.");break;
            case 8: System.out.println((Num+1)+" is for month: September.");break;
            case 9: System.out.println((Num+1)+" is for month: October.");break;
            case 10:System.out.println((Num+1)+" is for month: November.");break;
            default:System.out.println((Num+1)+" is for month: December."); break;
        }
        
     /*   if (Num == 0){
        System.out.println((Num+1)+" is for month: January.");
        }
        else if (Num == 1){
            System.out.println((Num+1)+" is for month: February.");
        }
        else if (Num == 2){
            System.out.println((Num+1)+" is for month: March.");
        }
        else if (Num == 3){
            System.out.println((Num+1)+" is for month: April.");
        }
        else if (Num == 4){
            System.out.println((Num+1)+" is for month: May.");
        }
        else if (Num == 5){
            System.out.println((Num+1)+" is for month: June.");
        }
        else if (Num == 6){
            System.out.println((Num+1)+" is for month: July.");
        }
        else if (Num == 7){
            System.out.println((Num+1)+" is for month: August.");
        }
        else if (Num == 8){
            System.out.println((Num+1)+" is for month: September.");
        }
        else if (Num == 9){
            System.out.println((Num+1)+" is for month: October.");
        }
        else if (Num == 10){
            System.out.println((Num+1)+" is for month: November.");
        }
        else {
            System.out.println((Num+1)+" is for month: December.");
        }*/
        }
    }