class Student{
    
    public Student() {
        System.out.println("HELLO");
    }
}

class pandel extends Student{
    public pandel(){
        System.out.println("pandel");
    }
}
public class EP1 extends Student {
    public static void main(String[] args) {
        new pandel();

    }
}