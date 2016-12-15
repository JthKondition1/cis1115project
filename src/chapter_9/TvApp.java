/*
 * @author Jason Heyer | heyerjt01
 */
package TVapp;

public class TvApp { 
    
    public static void main(String[] args) {
        TV tv1 = new TV();
        System.out.println(tv1);
        tv1.channelUp();
        tv1.setVolumeLevel(6); 
        tv1.turnOn(); 
        System.out.println(tv1);
    }
     
}
