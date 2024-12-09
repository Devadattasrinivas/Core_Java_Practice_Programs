package filehandling;
import java.io.*;
public class file8prac {
    public static void main(String[] args)throws IOException{

        File f=new File("cindrella.txt");
        f.createNewFile();
        FileWriter f1=new FileWriter(f,true);
        System.out .println("check in javaprograms file for output after command prompt execution");
        f1.write(88);
        f1.write("\n");
        f1.write("hello frnds u wont get anything");
        f1.write("\n");
        f1.write("did you get that");
        f1.close();
    }
}
