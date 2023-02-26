/*
 */

public class Clock {
    private long begin;
    private long end;
  
    
    public void start() {
        begin = System.currentTimeMillis();
    }
    
    public long stop(){
        end = System.currentTimeMillis();
        return end-begin;
    }
    
}
