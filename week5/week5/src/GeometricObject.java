public class GeometricObject {
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;

    public GeometricObject() {
        this.color = "white";
        this.filled = false;
        this.dateCreated = new java.util.Date();
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new java.util.Date();
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return this.dateCreated;
    }

    @Override
    public String toString() {
        return "created on " + this.dateCreated + "\ncolor: " + this.color + " and filled: " + this.filled;
    }

    public static void main(String[] args) {
        GeometricObject[] shapes = new GeometricObject[3];
        shapes[0] = new Circle(2.5, "red", true);
        shapes[1] = new Rectangle(3.0, 4.0, "green", false);
        shapes[2] = new Square(2.0, "blue", true);

        // Hiển thị thông tin của từng hình trong mảng
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].toString());
        }
    }
}
