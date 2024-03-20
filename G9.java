// this is to create directory and help manupulation of data in file
import java.io.*;
public class G9
{
    public static void main(String args[]) throws IOException
    {
        File dir = new File("PushpakJava");
        dir.mkdir();
        System.out.println(dir.isDirectory());

        File file = new File(dir,"Pushpak.txt");
        file.createNewFile();
        System.out.println(file.isFile());

        int count=0;
        File f = new File("PushpakJava");

        String str[] = f.list();

        for(String i : str)
        {
            count++;
            System.out.println(i);
        }

        System.out.println(count);
    }
}