// this is a program to use bufferedreader with filereader method

import java.io.*;

public class G14
{
    public static void main(String args[]) throws Exception
    {
        File dir = new File("PushpakJava");
        File file = new File("Pushpak1.txt");

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        char ch[] = new char[(int)file.length()];

        String Line = br.readLine();
        while(Line!=null)
        {
            System.out.println(Line);
            Line = br.readLine();
        }

    }
}