package ss7_abstract_interface.interface_colorable;

public class ShapeTest {

    public static void main(String[] args) {
//        Shape shape = new Shape();
//        System.out.println(shape);
//
//        shape = new Shape("red", false);
//        System.out.println(shape);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();

        for (Shape shape:shapes) {
            if (shape instanceof Circle) {
                System.out.println("The area of the circle: "+((Circle) shape).getArea());
            } else if (shape instanceof Rectangle) {
                System.out.println("The area of the rectangle: "+((Rectangle) shape).getArea());
            } else {
                ((Square)shape).howToGo();
            }
        }
    }

}
