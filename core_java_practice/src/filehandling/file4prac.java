package filehandling;
import java.io.*;
public class file4prac {
    public static void main(String[] args) throws IOException{
        String dir="directoyin4";
        File f=new File(dir);
        f.mkdir();
        System.out.println(f.isDirectory());

        String file="cricket.txt";//.txt entension file,no extension directory
        File f1=new File(file);
        f1.createNewFile();
        System.out.println(f1.isFile());

    }
}
