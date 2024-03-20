// this is a program to show the use of buffered writer

import java.io.*;

public class G13
{
    public static void main(String args[]) throws Exception
    {
        File dir = new File("PushpakJava");
        File file = new File("Pushpak1.txt");

        FileWriter fw = new FileWriter(file,true);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("java");
        bw.newLine();
        bw.write(65);
        bw.newLine();
        char ch[] = {'p','u','s','h','p','a','k'};
        bw.write(ch);

        bw.flush();
        bw.close();

    }
}