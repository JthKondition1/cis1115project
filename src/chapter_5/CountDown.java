/*
 * Countdown from 10 to 0.
 */
package examples;

/**
 *
 * @author heyerjt01 | Jason Heyer
 */
public class CountDown { 

    public static void main(String[] args) { 
        int i=0; 
        for( i = 10; i >= 0; i-- ){
            System.out.println();
        }
    }
   
}



















/*
 public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        Random rand = new Random();
        
        int randNum = (int)(Math.random()*10);
        // int randNum = (int)(Math.random()); 
        System.out.println("Random num is: " + randNum );
       
        while (randNum >= 0){
            System.out.println(randNum); 
            randNum--; 
        }
         
        System.out.print("Start number is: "); //Counts down from specified number
        int startNum = input.nextInt();        
        
        while(startNum >= 0){
            System.out.println(startNum);
            startNum--;
        }
    } */