package Sets;

import java.util.Objects;

public class Student {
    int id ;
    String name;

    Student(int id, String name){
        this.id = id;
        this.name =name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        System.out.println("Checking Hash for " + name);
        return Objects.hash(id, name);
    }
}
//Checking Hash for Alice (First Print):
//
//You called students.add(s1).
//
//The Set asked: "Which bucket does this go in?" It ran s1.hashCode().
//
//The bucket was empty, so s1 was added.
//
//Checking Hash for Alice (Second Print):
//
//You called students.add(s2).
//
//The Set asked: "Which bucket does this one go in?" It ran s2.hashCode().
//
//Crucial Point: It calculated the exact same bucket as s1.
//
//The "1" (Final Print):
//
//The Set looked inside that bucket and saw s1 was already there.
//
//It compared them, realized they are identical, and rejected s2.
//
//So, only 1 student remained in the set.