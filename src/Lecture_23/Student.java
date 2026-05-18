package Lecture_23;

public class Student {
    private String name="raj";
    private int age=18;
    public Student(){

    }
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age)  {
        try{
            if (age<0 || age>120){
                throw new Exception(age +" bklol age galat hai");
            }
            this.age = age;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("I'm in finally block");
        }

    }
}
