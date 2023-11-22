package ss7_abstract_interface.interface_resizeable;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
        System.out.println("This area: "+circle.getArea());

        circle.resize(100.0);
        System.out.println(circle);
        System.out.println("This area: "+circle.getArea());
    }
}