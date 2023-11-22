package ss4_class_object.fan;

public class Fan {
    public final static int SLOW = 1;
    public final static int MEDIUM = 2;
    public final static int FAST  = 3;
    private int speed;
    private  boolean on;
    private double radius;
    private String color;

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

    public Fan(){
        this.speed = SLOW;
        this.on = false;
        this.radius= 5;
        this.color= "blue";
    }
    public String toString(){
        if(on){
            return "Fan is On. Speed: "+this.speed+", Color : " + this.color + ", Radius: " +this.radius;
        } else return "Fan is off. Color : " + this.color + ", Radius: " +this.radius;
    }
}
