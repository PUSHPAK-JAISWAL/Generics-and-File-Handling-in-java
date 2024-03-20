// this is a class to know more about read method

import java.io.*;

public class G12
{
    public static void main(String args[]) throws Exception
    {
        File dir = new File("PushpakJava");
        File file = new File(dir,"Pushpak1.txt");

        FileReader fd = new FileReader(file);

        char ch[] = new char[(int)file.length()];

        fd.read(ch);

        for(char data:ch)
        {
            System.out.println(data);// this will give different output than file
        }

        System.out.print(ch);// this will give different output
    }
}