// this is a program to read data from the file

import java.io.*;

public class G11
{

    public static void main(String args[]) throws Exception
    {

        File dir = new File("PushpakJava");
        File file = new File(dir,"Pushpak1.txt");

        FileReader fd = new FileReader(file);

        int i = fd.read();
        
        while(i!=-1)
        {
            System.out.print(i+"----------->");
            System.out.println((char)i);
            i = fd.read();
        }
    }
}