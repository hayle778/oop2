
//q1. where is constant seat at?

//main class
public class Fan {
//Attributes
    private String speed;
    private boolean on;
    private double radius;
    private String color;

public Fan(){}        //d.c
//o.c
public Fan(int speed, boolean on, double radius, String color) {           //i.v
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
}

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
