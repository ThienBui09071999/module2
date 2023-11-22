package ss4_class_object.phuong_trinh_bac_2;
import java.util.Scanner;
public class SolveQuadraticEquation {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Phương trình bậc 2 có dạng :  aX^2 + bX + c = 0 \n" +
                "Mời bạn nhập hệ số a, b, c");
        double a = checkA();
        System.out.print("Nhập b: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập c: ");
        double c = Double.parseDouble(scanner.nextLine());
        System.out.println("Phương trình bạn vừa nhập là : " + a + "X^2+" + b + "X+" + c + "=0");
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
//        double delta = quadraticEquation.getDiscriminant();
        if (quadraticEquation.getDiscriminant() < 0) {
            System.out.println("The equation has no roots");
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("The equation has one root: " + quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has two root: ");
            System.out.println("root1: " + quadraticEquation.getRoot1());
            System.out.println("root2: " + quadraticEquation.getRoot2());
        }
    }
    public static double checkA() {
        System.out.print("Nhập a:");
        double a = Double.parseDouble(scanner.nextLine());
        while (true) {
            if (a != 0) {
                return a;
            } else {
                System.out.print("hệ số a phải khác 0, nhập lại a :");
                a = Double.parseDouble(scanner.nextLine());
            }
        }
    }
}
