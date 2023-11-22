package ss6_inheritance_polymorphism.point_moveablepoint;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(1,1);
        System.out.println(point);
        MovablePoint movablePoint = new MovablePoint(1,1,0.5f,0.5f);
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
