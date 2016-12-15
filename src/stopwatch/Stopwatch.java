/*/**
 *
 * @author Jason Heyer | heyerjt01 
 * Page 361 | Ex p9.6
 */
package stopwatchPackage;


public class Stopwatch { 
    
    private long startTime;                    // long = huge int numbers
    private long endTime;  

    public Stopwatch() { 
      startTime = System.currentTimeMillis();
      endTime = startTime;
    }
    
    
    public Stopwatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    } 
    
    public void start() {
        startTime = System.currentTimeMillis();
    }
    
    public void stop() {
        endTime = System.currentTimeMillis();
    }
    
    public long getElapsedTime() {
        return endTime - startTime;
    }
    
    @Override
    public String toString() {
        return String.format("Start: %d, Stop: %d, Elapsed: %d", 
                startTime, endTime, getElapsedTime());
    }
    
    
}
