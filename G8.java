// this is a class to show the use and how to implement file creating and handling in java
import java.io.*;
public class G8
{
    public static void main(String args[]) throws IOException
    {
        File file1 = new File("Pushpak.txt");// this is for file

        System.out.println(file1.exists());// false

        file1.createNewFile();// this create file
        System.out.println(file1.exists());// true

        File dir = new File("Pushpak");// this is for directory

        System.out.println(dir.exists());// false
        dir.mkdir();// this creates directorys
        System.out.println(dir.exists());//true
    }
}