public class Rectangle {
    private double width;
    private double height;

    public void setWidth(double width){
        this.width = width;
    }
    public  void setHeight(double height){
        this.height = height;
    }
    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }
    public double getArea(){
        return this.height*this.width;
    }
    public double getPerimeter(){
        return 2*(this.width+this.height);
    }
}
