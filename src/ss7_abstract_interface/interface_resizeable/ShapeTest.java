package ss7_abstract_interface.interface_resizeable;

public class ShapeTest {

    public static void main(String[] args) {
//        Shape shape = new Shape();
//        System.out.println(shape);
//
//        shape = new Shape("red", false);
//        System.out.println(shape);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Square();
        shapes[2] = new Rectangle();

        for (Shape shape:shapes) {
            if (shape instanceof Circle) {
                System.out.println((Circle)shape);
            } else if (shape instanceof Square) {
                System.out.println((Square)shape);
            } else {
                System.out.println((Rectangle)shape);
            }
        }

    }
}
