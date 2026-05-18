package Lecture_23;

public class StudentClient {
    public static void main(String[] args)  {
        Student s=new Student("Ankit",25);
        s.setAge(19);
        System.out.println(s.getAge());
        System.out.println("bye");
    }

}
