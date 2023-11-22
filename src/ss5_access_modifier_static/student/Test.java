package ss5_access_modifier_static.student;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("student's name is: "+student.getName());
        System.out.println("student's class is "+student.getClasses());
        student.setName("Thiên");
        student.setClasses("C0723L1-JV105");
        System.out.println("student's name is: "+student.getName());
        System.out.println("student's class is "+student.getClasses());
    }
}
