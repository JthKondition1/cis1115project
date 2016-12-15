/*
 * @author Jason Heyer | 55heyerjt01
 */
package Arrays;

public class C7StatsStaticTest {

    public static void main(String[] args) {
        int[] x = {2, 1, 6, 3, 4, 5, 2};  //book numbers {1.9, 2.5, 3.7, 2, 1, 6, 3, 4, 5, 2}; 
        System.out.println( "The sum is: " + C7StatsStatic.sum(x));
        System.out.println( "The maximum value is: " + C7StatsStatic.max(x));
        System.out.println( "The minimum value is: " + C7StatsStatic.min(x)); 
        System.out.println( "The average is: " + C7StatsStatic.avg(x));
        System.out.println( "The standard deviation is: " + C7StatsStatic.standardDeviation(x)); 
         C7StatsStatic.reverse(x);
        System.out.println( "The reverse order is: " + C7StatsStatic.toString(x)); 
        int[] nums = C7StatsStatic.reverseNC(x);
         System.out.println( "ReverseNC gives: " + C7StatsStatic.toString(nums));
         System.out.println( "The above avg is: " + C7StatsStatic.aboveAvg(x));
        System.out.println( "count 100= " + C7StatsStatic.count100(x));
    } 
}
  