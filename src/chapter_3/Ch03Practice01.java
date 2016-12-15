package examples;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Ch03Practice01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Y: ");
        double y = input.nextDouble();
        if (y > 0) {
            System.out.println("x=1");
        }
    }
}
