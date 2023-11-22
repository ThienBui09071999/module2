package ss5_access_modifier_static.circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        System.out.println("This radius: "+circle.getRadius());
        System.out.println("This area: "+circle.getArea());
    }
}
