/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import java.util.Scanner;

/**
 *
 * @author heyerjt01 | Jason Heyer
 */
public class Sum1 { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;  
        System.out.print("How many numbers to sum: "); 
        int n = input.nextInt(); 
        for(int i=0; i<n; i++ ){
            System.out.print("Enter number " + (i+1) + ": "); 
            int myNum = input.nextInt(); 
            sum = sum + myNum; 
        }
        System.out.println("The sum is " +sum); 
        System.out.println("The average is " + (sum/n));
    } 
}
