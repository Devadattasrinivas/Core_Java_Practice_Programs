package filehandling1;
import java.io.*;
public class Fileh4 {
    public static void main(String[] args) throws  IOException{
        FileWriter f=new FileWriter("cindrella.txt");
        PrintWriter p=new PrintWriter(f);
        p.write(100);
        p.println(100);
        p.println('c');
        p.println(23.6);
        p.println("denis ritchie");
        p.flush();
        p.close();
    }
}
