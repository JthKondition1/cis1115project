/**
 * Statistics class with methods for various stats.
 *
 * @author Jason Heyer
 */
package utilities;

import listPackage.StoreItem;

public class StatsStatic {

    public StatsStatic() { 
         public int quantityStats(int[] x) {
        x = new int[2000];
        int count = 0;
        for (StoreItem storeItem : itemList) {
            x[count] = storeItem.getQuantity();
            count++;
        }
     return x;
    }
    

        public static int sum(int[] x) {    // static cant access instance variables;   
        int total = 0;                         // helper class, doesnt need own instance variables;
        for (int i = 0; i < x.length; i++) {
            total += x[i];
        }
        return total;
    }
/**
 * Returns minimum value.
 * @param x
 * @return 
 */
    public static int min(int[] x) {
        int smallest = Integer.MAX_VALUE; // Starts at biggest value
        for (int i = 0; i < x.length; i++) {
            if (x[i] < smallest) {
                smallest = x[i];
            }
        }
        return smallest;

    }
/** 
 * Returns <i>maximum</i> value. 
 * @param x
 * @return 
 */
    public static int max(int[] x) {
        int biggest = Integer.MIN_VALUE; //starts at smallest value
        // System.out.println("The biggest int is " + biggest);
        for (int i = 0; i < x.length; i++) {
            if (x[i] > biggest) {
                biggest = x[i];
            }
        }
        return biggest;

    }
/**
 * Returns average value.
 * @param x
 * @return 
 */
    public static double avg(int[] x) {
        if (x.length > 0) {
            return (double) sum(x) / x.length;
        }
        return 0;
    }
/**
 * Returns the standard deviation.
 * @param x
 * @return 
 */
    public static double standardDeviation(int[] x) {  // as shown on pg. 278(c7n11) 
        double mean = avg(x);
        double total = 0;
        for (int i = 0; i < x.length; i++) {
            total += Math.pow(x[i] - mean, 2);
        }
        return Math.sqrt(total / (x.length - 1));
    }
/**
 * Reverses the order.
 * @param x 
 */
    public static void reverse(int[] x) {
        for (int i = 0; i < x.length / 2; i++) {
            int temp = x[i];
            x[i] = x[x.length - i - 1];
            x[x.length - i - 1] = temp;
        }
    }
/**
 * Reverses order into new array named result.
 * @param x
 * @return 
 */
    public static int[] reverseNC(int[] x) {
        int n = x.length;
        int[] result = new int[x.length];
        for (int resultIndex = 0, xIndex = n - 1; resultIndex < x.length; resultIndex++, xIndex--) {
            result[resultIndex] = x[xIndex];
        }
        return result;
    }
/**
 * Returns the above average value.
 * @param x
 * @return 
 */
    public static int[] aboveAvg(int[] x) {
        int[] aboveAv = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            if (x[i] > avg(x)) {
                aboveAv[i] = x[i];
            }
        }
        return aboveAv;
    }

    /* 
    *  Assume integer values in array x are between 0 and 100. Problem 7.3.
    * Count the number of occurrences of each values and return an array of counts. 
     */ 
    /**
     * Returns the occurrence of each value.
     * @param x
     * @return 
     */
    public static int[] count100(int[] x) {
        int[] copyX = new int[101];   //for loop, each value. use value as index for array count. 
       // System.arraycopy(x, 0, copyX, 0, x.length);

        for (int i = 0; i < x.length; i++) {
            int total = 0;
            for (int j = 0; j < x.length; j++) {
                x[i]= copyX[j];    
                total++; 
            
            }
       
        } 
       return copyX;
    }
/**
 * Turns given array into a string.
 * @param x
 * @return 
 */
    public static String toString(int[] x) {
        StringBuilder sb = new StringBuilder("");
        int i = 0;
        for (i = 0; i < x.length - 1; i++) {
            sb.append(x[i]).append(",");
        }
        if (x.length > 0) {
            sb.append(x[i]);
        }
        return sb.toString();
    }
}
