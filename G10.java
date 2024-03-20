// this is a class to perform write operations with filewriter in java
import java.io.*;

public class G10 
{
    public static void main(String args[]) throws IOException
    {

        File dir = new File("PushpakJava");
        System.out.println(dir.isDirectory());

        File file1 = new File(dir,"Pushpak1.txt");
        System.out.println(file1.isFile());
        file1.createNewFile();

        FileWriter fw = new FileWriter(file1);// this is to initialized to do operations on this file

        fw.write("Pushpak");
        fw.write("\n");
        fw.write(65);
        fw.write("\n");
        fw.write(97);
        fw.write("\n");
        char ch[]={'j','a','v','a'};
        fw.write(ch);

        //fw.close();// this is necessary to make the done to to make changes in file
        //fw.flush();

        fw.close();
        System.out.println("Open Pushpak1.txt to see the result");


    }
}