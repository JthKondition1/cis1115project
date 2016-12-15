/*
 * If word begins with vowel add "way" 
 *  else move first letter to end of word and add "ay". 
 */
package examples;

import java.util.Scanner;

/**
 *
 * @author Jason Heyer
 */
public class Ch4_PigLatin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter a word: "); 
        String word = input.nextLine();
        String fChar = word.substring(0,1);     
       
        if ( fChar.equals("a") || fChar.equals("e") || fChar.equals("i")
                || fChar.equals("o") || fChar.equals("u") ) {
            System.out.println(word+"way");   
        }else{
            System.out.println(word.substring(1)+fChar+"ay");
         }

    }
}
//word.substring(0).equals("a","e","i","o","u") why doesnt this work? 
//                           ^^^^^ need to be fully typed out | ex.> fchar.equals("a") || fchar.equals("b") etc
// Hw pg.??? > problem: 4. 18