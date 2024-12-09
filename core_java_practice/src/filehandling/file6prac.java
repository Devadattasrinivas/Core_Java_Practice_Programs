package filehandling;
import java.io.*;
/*
public class file6prac {
    public static void main(String[] args) {
        String name="C:\\javaprograms";
        File f=new File(name);
        String[] nam=f.list();
        int count=0;
        for(String n:nam){
            System.out.println(n);
            count++;
        }
        System.out.println(count +"count of files in directory");
    }
}
 */

public class file6prac {
    public static void main(String[] args) {
        String name="C:\\javaprograms";
        File f=new File(name);
        String[] nam=f.list();
        int dircount=0;
        int filecount=0;
        for(String n:nam){
          if(f.isFile()){
              filecount++;
          }
          if(f.isDirectory()){
              dircount++;
          }
        }
        System.out.println(filecount+"count of files in directory");
        System.out.println(dircount+"count of directories  in drive");

    }
}

