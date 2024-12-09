package filehandling;
import java.io.*;
public class file2prac {
    public static void main(String[] args)throws IOException {
        String name="erar.txt";
        File f=new File(name);
        System.out.println(f.exists());
        f.createNewFile();
        System.out.println(f.exists());
    }
}
