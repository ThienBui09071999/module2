package ss6_inheritance_polymorphism.point2d_point3d;

public class Main {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(1,1,1);
        System.out.println(point3D);
        point3D.setXYZ(2,2,2);
        System.out.println(point3D);
        Point2D point2D = new Point2D(3,3);
        System.out.println(point2D);
        point2D.setXY(7,7);
        System.out.println(point2D);
    }
}
