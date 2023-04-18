import java.util.Date;
public class Stopwatch {
    private long startTime;
    private long endTime;
    public static Date date = new Date();
    public void setStartTime(long startTime){
        this.startTime = startTime;
    }
    public void setEndTime(long endTime){
        this.endTime = endTime;
    }
    public long getStartTime(){
        return this.startTime;
    }
    public long getEndTime(){
        return this.endTime;
    }
    public void Stopwatch(){
        this.startTime = date.getTime();
    }
    public void start(){
        this.startTime = date.getTime();
    }
    public  void stop(){
        this.endTime = date.getTime();
    }
    public long getElapsedTime(){
        if (endTime > 0) {
            return this.endTime-this.startTime;
        }
        else {
            return 0;
        }
    }
}
