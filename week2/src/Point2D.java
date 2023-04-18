public class Point2D {
    private double x;
    private double y;
    public void  Point2D(double x , double y){
        this.x = x;
        this.y = y;
    }
    public double distance(double x, double y){
        return Math.sqrt(Math.pow((x-this.x),2)-Math.pow((y-this.y),2));
    }
    public double distance(java.awt.geom.Point2D p){
        return Math.sqrt(Math.pow((p.getX()-this.x),2)-Math.pow((p.getY()-this.y),2));
    }
    public double getX(){
        return this.x;
    }
    public double getY() {
        return this.y;
    }
    public String toString(){
        return ("("+this.x+";"+this.y+")");
    }
}
