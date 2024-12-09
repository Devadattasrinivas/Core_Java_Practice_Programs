package filehandling;
import java.io.*;
public class file5 {
    public static void main(String[] args) throws IOException {
        String location="c:\\pwskills";//creates new dir in c drive
        File f=new File(location);
        f.mkdir();

        File f1=new File(f,"dutch.txt");
        f1.createNewFile();

    }
}
