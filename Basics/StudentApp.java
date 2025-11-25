package Basics;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter StudentID: ");
        String studentId = sc.nextLine();

        System.out.println("Enter Basics.Student Name");
        String studentName = sc.nextLine();

        Student newStudent = new Student(studentId,studentName);

        System.out.println("Enter GPA: ");
        double gpa = sc.nextDouble();

        newStudent.setGpa(gpa);

        System.out.println("------Basics.Student Registered-------");
        System.out.println(newStudent.getName()+" has been saved in "+ Student.schoolName);
    }
}
