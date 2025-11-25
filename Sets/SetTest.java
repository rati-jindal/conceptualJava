package Sets;

import java.util.HashSet;

public class SetTest {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        Student s1 = new Student(1, "Alice");
        Student s2 = new Student(1, "Alice");

        students.add(s1);
        students.add(s2);

        System.out.println(students.size());
    }
}
