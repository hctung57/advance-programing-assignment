public class TV {
    private int chanel;
    private  int volumeLevel;
    private boolean on;
    public void TV(){
        this.chanel = 1;
        this.volumeLevel = 50;
    }
    public void turnOn(){

    }
    public  void turnOff(){

    }
    public  void setChanel(int newChannel){
        this.chanel = newChannel;
    }
    public void setVolume(int newVolumeLevel){
        this.volumeLevel = newVolumeLevel;
    }
    public void channelUp(){
        this.chanel++;
    }
    public void channelDown(){
        this.chanel--;
    }
    public void volumeUp(){
        this.volumeLevel++;
    }
    public void volumeDown(){
        this.volumeLevel--;
    }
}
