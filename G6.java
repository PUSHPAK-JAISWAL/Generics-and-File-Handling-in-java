// this is the program to sort the following with the use of the comparable
import java.util.*;

class Student2 implements Comparable<Student2> {
    int marks;
    int age;
    String name;

    public Student2(int marks, int age, String name) {
        this.marks = marks;
        this.age = age;
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "" + marks + " - " + age + " - " + name;
    }

    public int compareTo(Student2 other) {
        // Compare based on age
        return Integer.compare(this.age, other.age);
    }
}

public class G6 {
    public static void main(String args[]) {
        Student2 st1 = new Student2(45, 17, "Rohit");
        Student2 st2 = new Student2(80, 10, "Rohan");
        Student2 st3 = new Student2(70, 18, "Pushpak");

        List<Student2> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);

        System.out.println("Before sorting:");
        System.out.println(list);

        Collections.sort(list);

        System.out.println("After sorting by age:");
        System.out.println(list);
    }
}
