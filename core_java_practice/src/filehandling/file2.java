package filehandling;
import java.io.*;
//use command prompt
public class file2 {
    public static void main(String[] args) throws IOException {
        String filename="abc.txt";//use(.txt) extension for file creation otherwise it creates problem while reading from a file
        //this line will check whether the file exists or not
        //if exists then point to that file if not represents a java file obj,not physical file
        File f=new File(filename);
        System.out.println(f.exists());//false //when we run second time true becoz at 1st time execu file created0

        //creates physical file for the  java file obj
        f.createNewFile();
        System.out.println(f.exists());


    }
}
