package PreProjectJava;

import java.util.Scanner;

/**
 * Enter Fahrenheit temperature (t) and wind speed velocity (v). Calculate wind
 * chill using: 
 * twc = 35.74+0.6215t - 35.75v^0.16 + 0.4275(t)(v^0.16)
 * @author Jason Heyer
 */
public class P02N17WindChill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temp, wind speed: ");
        double t = input.nextDouble(); 
        double v = input.nextDouble(); 
        
        double twc1 = 35.74 + 0.6215 * t;
        double twc2 = 35.75* Math.pow(v, 0.16); 
        double twc3 = 0.4275*t*(Math.pow(v,0.16)); 
        
        double twc = twc1-twc2+twc3; 
        System.out.printf("The wind chill is %1.2f\n", twc); 
    }
}
 //hw sept 21: pg 74 #2.21 & 2.23