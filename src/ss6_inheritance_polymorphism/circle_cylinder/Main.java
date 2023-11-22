package ss6_inheritance_polymorphism.circle_cylinder;

public class Main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(2,"blue",2);
        System.out.println("Thể tích của hình trụ là: "+cylinder.getVolume());
        System.out.println(cylinder);
        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1);
    }
}
