package examples;

import java.util.Random;
import java.util.Scanner;

/**
 * **3.21: "Science: day of the week" 
 *            Prompt for year, month, & day then return day of week.
 *
 * @author Jason Heyer
 */
public class P03N3_21DayOfWeek {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year(e.g., 1988): ");
        int year = input.nextInt(); //Year
        System.out.print("Enter month(1-12): ");
        int m = input.nextInt(); //Month
        System.out.print("Enter day of the month(1-31): ");
        int q = input.nextInt(); //Day of Month
          
        int h = ((q) + (13*(m+1)) / 5 + (year) + (year / 4) - (year/100) + (year / 400)) % 7; 
        
         System.out.print("Day of the week is ");
        switch (h){
            case 0: System.out.print("Saturday."); break;
            case 1: System.out.print("Sunday."); break;
            case 2: System.out.print("Monday."); break;
            case 3: System.out.print("Tuesday."); break;
            case 4: System.out.print("Wednesday."); break;
            case 5: System.out.print("Thursday."); break;
            default: System.out.print("Friday."); break;
        }
        //System.out.println("test "+h);
        }
        
        //Test
    } //2015, 1, 25 OR 2012, 5, 12
