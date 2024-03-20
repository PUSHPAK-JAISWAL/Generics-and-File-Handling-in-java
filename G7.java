// this is program to show the use of the fundamentals of io operations
import java.util.*;

class Student3
{
    private String name;
    private int age;
    private String city;
    public Student3(String name, int age, String city)
    {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String toString()
    {
        return "Name : "+name+" Age : "+age+ " City : "+city;
    }
}

public class G7
{
    public static void main(String args[])
    {
        Student3 st1 = new Student3("pushpak", 18, "Sambhaji nagar");
        System.out.println(st1);
        Student3 st2 = new Student3("virat",30,"Delhi");
        System.out.println(st2);
    }
}