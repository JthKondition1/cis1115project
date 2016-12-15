package examples;

import java.util.Random;
import java.util.Scanner;

/**
 * Game: scissor, paper, rock.
 *
 * @author Jason Heyer
 */
public class P03N3_17RockPaperSkizrz {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("Choose your weapon... ");
        System.out.print("Scissor(0), Rock(1), Paper(2): ");

        int choice = input.nextInt(); //User's Choise
        int Num = (int) (Math.random() * 3); //Computer's random choise  

        if (Num == 0 && choice == 0) {
            System.out.print("The computer is Scissor. "
                    + "You are Scissor too. It is a draw.");
        } else if (Num == 0 && choice == 1) {
            System.out.print("The computer is Scissor. "
                    + "You are Rock. You won.");
        } else if (Num == 0 && choice == 2) {
            System.out.print("The computer is Scissor. "
                    + "You are Paper. You lost.");
        } else if (Num == 1 && choice == 0) {
            System.out.print("The computer is Rock. "
                    + "You are Scissor. You lost.");
        } else if (Num == 1 && choice == 1) {
            System.out.print("The computer is Rock. "
                    + "You are Rock. It is a draw.");
        } else if (Num == 1 && choice == 2) {
            System.out.print("The computer is Rock. "
                    + "You are Paper. You won.");
        } else if (Num == 2 && choice == 0) {
            System.out.print("The computer is Paper. "
                    + "You are Scissor. You won.");
        } else if (Num == 2 && choice == 1) {
            System.out.print("The computer is Paper. "
                    + "You are Rock. You lost.");
        } else {
            System.out.print("The computer is Paper. "
                    + "You are Paper too. It is a draw.");
        }
    }
}
