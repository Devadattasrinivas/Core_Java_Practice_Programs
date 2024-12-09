package filehandling;
import java.io.*;
public class file4 {
    public static void main(String[] args) throws IOException {
        String direcname="kabaddi Team";
        File f=new File(direcname);
        f.mkdir();
        System.out.println(f.isDirectory());//true

        File f1=new File(f,"telkings.txt");
        f1.createNewFile();
        System.out.println(f.isFile());//false becoz f is direc
        System.out.println(f1.isFile());//true  becoz f is file

    }
}
