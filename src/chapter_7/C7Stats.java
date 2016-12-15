/*
 *
 * @author  Jason Heyer || heyerjt01
 */
package Arrays;


public class C7Stats {

private int[] x = new int[100];            // instance variables: are created when class is created/called; 
private int n = 0;                         // each object gets its own set of these;

    public C7Stats() {                      // constructor must match class exactly. Special method that gets called
        System.out.println("In constructor"); // whenever you create a new instance of a class;   
        x[0] = 5;
        x[1] = 10;
        x[2] = 15;
        n = 3;
    }

    public int sum() {
        System.out.println("In constructor");  // variables inside method
        int total = 0;                      // are called local variables, only exist while the method runs;
        for(int i=0; i<n; i++){
            total += x[i];
        } 
        return total;
    }

    public static void main(String[] args) {
        System.out.println("In main");

        C7Stats stats1 = new C7Stats();       // calls the class, then compiles the constructor (C7Stats in this case) 
        System.out.println("The sum is: " + stats1.sum() );
    }
}
 