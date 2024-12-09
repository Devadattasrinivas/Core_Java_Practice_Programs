package filehandling;
import java.io.*;
public class file5prac {
    public static void main(String[] args)throws IOException {
      String locate="C:\\ratnakeerita";
      File f=new File(locate);
        System.out.println("check this direc in c drive");
        System.out.println(f.exists()+" exists ");
        f.mkdir();
        System.out.println(f.exists()+" exists");
        System.out.println(f.isDirectory()+" is directiory");


        File f1=new File(" float.txt");
        f1.createNewFile();
        System.out.println(f1.exists()+" exists "+f1.isFile());


    }
}
