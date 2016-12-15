
/**
 *
 * @author 55heyerjt01
 */
 
package stopwatchPackage;

import java.util.Random;

public class stopwatchApp {
    public static void main(String[] args) {
        Stopwatch sw1 = new Stopwatch(); 
        System.out.println(sw1); 
        Random rand = new Random(); 
        int [] x = new int [100000]; 
        for(int i=0; i<x.length; i++) {
            x[i] = rand.nextInt(); 
        }
        sw1.stop(); 
        System.out.println(sw1);
    }
    
}
