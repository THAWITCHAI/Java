import java.util.ArrayList;

class Student{
    private String id;
    private String name;
    private int age;

    public Student(String id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    
    public String toString(){
        return "ID: "+id+"NAME: "+name+"AGE.: "+age;
    }
}

public class arrayList3 {
    public static void main(String[] args) {
        ArrayList<Student> students = createStudentList();
        System.out.println(students);
    }

    private static ArrayList<Student> createStudentList(){
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student(null, null, 0));
        students.add(new Student(null, null, 0));
        return students;
    }
}
