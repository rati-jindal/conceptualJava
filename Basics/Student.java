package Basics;

public class Student {
    private String studentId;
    private String name;
    private double gpa;
    static String schoolName = "Java High";

    Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }
    public void setGpa(double gpa){
        if (gpa<0.0 || gpa>4.0){
            System.out.println("Invalid GPA");
        }
        else{
            this.gpa = gpa;
        }
    }
    public String getName(){
        return this.name;
    }
    public double getGpa(){
        return this.gpa;
    }

    public static void main(String[] args) {
        Student john = new Student("101","John");
        john.setGpa(5.5);
        john.setGpa(3.5);
        System.out.println(john.getName());
        System.out.println(john.getGpa());
//        System.out.println(john.schoolName);
        System.out.println(Student.schoolName);
    }
}
