// this is a program to use write operation with PrintWriter

import java.io.*;

public class G15
{
    public static void main(String args[]) throws Exception
    {
        File dir = new File("PushpakJava");
        File file = new File(dir,"Pushpak1.txt");

        FileWriter fw = new FileWriter(file);

        PrintWriter pw = new PrintWriter(fw);

        pw.write(97);
        pw.write("\n");

        pw.println(100);
        pw.println("Java");
        pw.println("Pushpak");
        pw.println('a');
        pw.println(50.6);
        pw.println(true);
        pw.flush();
        pw.close();
    }
}