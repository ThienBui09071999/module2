package ss12.map;

import java.util.Objects;
// implements Comparable<Student>
public class Student implements Comparable<Student> {
    private int id;
    private String name;

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object object) {
        Student student = (Student) object;
        return this.id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
//        if ( o.getId()- this.getId()==0){
//          return this.getName().compareTo(o.getName());
//        }else {
//            return o.getId()- this.getId();
//        }
        return o.getId()- this.getId();
    }
}
