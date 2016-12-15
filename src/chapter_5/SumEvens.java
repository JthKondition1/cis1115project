/*
 * Program to sum up the even numbers between 2 and 2000. 
* @author heyerjt01 | Jason Heyer
 */
package examples;

public class SumEvens {

    public static void main(String[] args) {
        long sum = 0;
        for (long i = 5; i <= 5000; i += 5) {
         //   if (i % 2 == 0) {
                sum += i;
           // }
        }
        System.out.println("The sum is " + sum);
    }

}
