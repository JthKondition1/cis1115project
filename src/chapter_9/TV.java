package TVapp;

/**
 *
 * @author Jason Heyer | heyerjt01
 */
public class TV {
 
    private int channel;
    private int volumeLevel;
    private boolean on;

    public TV() {
        channel = 2; 
        volumeLevel = 3;
        on = false;
    }

    public TV(int channel, int volumeLevel, boolean on) {
        this.channel = channel;
        this.volumeLevel = volumeLevel;
        this.on = on;
    }

    public int getChannel() {
        return channel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public boolean isOn() {
        return on;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void channelUp() {
        channel++;
    }

    public void channelDown() {
        channel--;
    }
    
    public void volumeUp(){
        if(volumeLevel<9){
            volumeLevel++; 
        }
    }
    
    public void volumeDown(){
        if(volumeLevel>0){
            volumeLevel--;
        }
    }
    
    
    @Override
    public String toString() {
        return "TV{" + "channel=" + channel + ", volumeLevel=" + volumeLevel + ", on=" + on + '}';
    }
    
}
