// this is  a program to show selective serilazation in the program

import java.io.*;
import java.util.*;
class Cricketer1 implements Serializable
{
    String name;
    transient int age;
    int runs;
    Cricketer1(String name,int age,int runs)
    {
        this.name = name;
        this.age =age;
        this.runs = runs;
    }
    void display()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(runs);
    }

}
public class G17
{
    public static void main(String args[]) throws Exception
    {
        Cricketer1 c= new Cricketer1("Sachin",44, 30000);
        //c.display();

        FileOutputStream fos = new FileOutputStream("Pushpak1.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos); // Corrected

        oos.writeObject(c); // Corrected

        oos.flush();
        oos.close();

        FileInputStream fis = new FileInputStream("Pushpak1.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);

        Cricketer1 cr =(Cricketer1)ois.readObject();
        cr.display();
}
}