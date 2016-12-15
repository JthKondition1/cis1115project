/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_2;

import java.util.Scanner;

/**
 *
 * @author 55heyerjt01   // 900.5, 25.5, 3.55
 */
public class P02N2_23DrivingCost { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
        System.out.print("Enter distance to drive, "
                + "fuel efficiency of car in MPG, and the price per gallon: "); 
        double dist = input.nextDouble();  
        double mpg = input.nextDouble();
        double ppg = input.nextDouble(); 
        
        double cost = (dist/ mpg * ppg); 
        
        System.out.printf("The cost of driving is: %2.2f\n", cost);
    }
    
}
