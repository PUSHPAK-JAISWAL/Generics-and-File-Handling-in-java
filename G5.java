// this is a class to make the use of comparator and comparable for the collections
import java.util.*;

class Student1
{
    int marks;
    int age;
    String name;
    public Student1(int marks, int age, String name)
    {
        this.marks = marks;
        this.age = age;
        this.name = name;

    }

    public int getMarks()
    {
        return marks;
    }
    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }

    public String toString()
    {
        return ""+marks+" - "+age+" - "+name;
    }
}

class Alpha implements Comparator<Student1>
{
    public int compare(Student1 a, Student1 b)
    {
        if (a.age>b.age)
        {
            return 1;
        }
        else 
        {
            return -1;
        }
    }
}

public class G5
{
    public static void main(String args[])
    {
        Student1 st1 = new Student1(45,17,"Rohit");
        Student1 st2 = new Student1(80,10,"Rohan");
        Student1 st3 = new Student1(70,18,"Pushpak");

        List<Student1> list = new ArrayList<Student1>();
        list.add(st1);
        list.add(st2);
        list.add(st3);

        System.out.println(list);


        Alpha a = new Alpha();

        Comparator<Student1> com=(Student1 one , Student1 two)->{
            if(one.marks>two.marks)
            {
                return 1;
            }
            else 
            {
                return -1;
            }
        };

        Collections.sort(list,a);
        System.out.println(list);

        Collections.sort(list,com);
        System.out.println(list);

    }
}