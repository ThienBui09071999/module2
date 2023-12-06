package ss12.map;

import java.util.*;

public class DemoMap {
    public static void main(String[] args) {
        // tạo map để lưu thông tin vắng nghỉ học viên
//        Map<Student,Integer> map = new LinkedHashMap<>();
        Map<Student,Integer> map = new TreeMap<>();
        map.put(new Student(1,"chanh1"),0);
        map.put(new Student(1,"chanh11"),1);
        map.put(new Student(2,"chanh2"),3);
        map.put(new Student(3,"chanh3"),4);
        map.put(new Student(4,"chanh4"),1);
        // duyệt map
        Set<Student> studentKeys = map.keySet();
        for (Student studentKey: studentKeys) {
            System.out.println("SV tên "+studentKey.getName()+ " : "+map.get(studentKey));
        }

//        List<Student> studentList =new ArrayList<>();
//        studentList.add(new Student(10,"chanh10"));
//        studentList.add(new Student(1,"chanh1"));
//        studentList.add(new Student(2,"chanh2"));
//        studentList.add(new Student(2,"achanh2"));
//        studentList.add(new Student(4,"chanh4"));
//        System.out.println("-------chưa sắp xếp--------------");
//        for (Student s: studentList) {
//            System.out.println(s);
//        }
//        System.out.println("--------- sắp xếp giảm dần theo id và tên-----------");
//        Collections.sort(studentList);
//        for (Student s: studentList) {
//            System.out.println(s);
//        }
//        System.out.println("-------------săp xếp tăng dần theo id------------");
//        Collections.sort(studentList,new CompaId());
//        for (Student s: studentList) {
//            System.out.println(s);
//        }
//        System.out.println("--------------sắp xếp theo tên------------------");
//        // tạo một lớp lạc danh
//        Collections.sort(studentList, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
//        for (Student s: studentList) {
//            System.out.println(s);
//        }
    }
}
