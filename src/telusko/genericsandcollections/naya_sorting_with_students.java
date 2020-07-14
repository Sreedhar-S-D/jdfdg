package telusko.genericsandcollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class naya_sorting_with_students {
    public static void main(String[] args) {
        List<Student> s = new ArrayList<>();
        s.add(new Student(1,64));
        s.add(new Student(2,76));
        s.add(new Student(3,68));
        s.add(new Student(4,73));
        s.add(new Student(5,82));

        Collections.sort(s,((o1, o2) -> {
            return (o1.marks>o2.marks)?1:-1;
        }));

        s.forEach(System.out::println);
    }


}

class Student implements Comparable<Student>
{
    int rollno;
    int marks;
    static int no_of_objects = 0;
    {
        no_of_objects += 1;
    }

    public Student(int rollno, int marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student ->" +
                "Roll no:" + rollno +
                ", marks: " + marks +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}