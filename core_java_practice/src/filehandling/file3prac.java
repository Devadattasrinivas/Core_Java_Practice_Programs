package filehandling;
import java.io.*;
public class file3prac {
    public static void main(String[] args) {
        String location="direccreated";
        File f=new File(location);
        System.out.println(f.exists());
        System.out.println(f.isDirectory());
        f.mkdir();
        System.out.println(f.isDirectory());

    }
}
