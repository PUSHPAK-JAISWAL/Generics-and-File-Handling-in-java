// this is a program to show the use of serialization and deserializaton

import java.io.*;
import java.util.*;
class Cricketer implements Serializable 
{
    private int age;
    private String name;
    private int runs;

    public Cricketer(String name,int age, int runs)
    {
        this.age = age;
        this.name= name;
        this.runs= runs;
    }
    void display()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(runs);
    }
}

public class G16
{
    public static void main(String args[]) throws Exception
    {
        Cricketer c = new Cricketer("Pushpak",19,99);
        //c.display();
        FileOutputStream fos= new FileOutputStream("Pushpak.txt");// this is used for Serialization
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(c);
        oos.flush();
        oos.close();

        FileInputStream fis = new FileInputStream("Pushpak.txt");// this is for deserialization
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Cricketer cr=(Cricketer)ois.readObject();

        cr.display();
        ois.close();
    }
}