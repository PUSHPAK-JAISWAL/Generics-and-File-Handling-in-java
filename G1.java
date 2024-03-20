// this is the program to show the use of genrics in java

import java.util.ArrayList;

class Student
{
    private String name;
    private int id;
}
class Employ
{
    private String name;
    private int id;
}
public class G1
{
    public static void main(String args[])
    {
        Student st1 = new Student();
        Student st2 = new Student();

        Employ e = new Employ();

        ArrayList<Student> al = new ArrayList<Student>();
        al.add(st1);
        al.add(st2);
    }
}