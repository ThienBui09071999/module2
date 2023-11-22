package ss5_access_modifier_static.circle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }
    public double getRadius() {
        return this.radius;
    }
    public double getArea() {
        return Math.PI*this.radius*this.radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String toString() {
        return "Radius : " + this.radius + "|| color: " + this.color;
    }
}
