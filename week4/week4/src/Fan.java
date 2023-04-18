/*
+-------------------------+
|         Fan             |
+-------------------------+
| -speed: int              |
| -on: boolean             |
| -radius: double          |
| -color: string           |
|-------------------------|
| +SLOW: int = 1           |
| +MEDIUM: int = 2         |
| +FAST: int = 3           |
|-------------------------|
| +Fan()                   |
| +getSpeed(): int         |
| +setSpeed(speed: int): void |
| +isOn(): boolean         |
| +setOn(on: boolean): void|
| +getRadius(): double     |
| +setRadius(radius: double): void |
| +getColor(): string      |
| +setColor(color: string): void |
| +toString(): string      |
+-------------------------+
*/
public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        speed = SLOW;
        on = false;
        radius = 5.0;
        color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean newOn) {
        on = newOn;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String newColor) {
        color = newColor;
    }

    public String toString() {
        if (on) {
            return "Speed: " + speed + ", Color: " + color + ", Radius: " + radius;
        } else {
            return "Color: " + color + ", Radius: " + radius + ", Fan is off";
        }
    }
}