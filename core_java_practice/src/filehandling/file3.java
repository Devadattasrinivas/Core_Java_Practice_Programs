package filehandling;
import java.io.*;
//java.io api classes are built using the standards of unix os
//in linux/unix there is no diff b/w linux/unix
public class file3 {
    public static void main(String[] args) {
      String dirname="iplteams";
      //it treats as directory,for jvm no diff b/w file and direc..
      File f=new File(dirname);
      System.out.println(f.exists());

      f.mkdir();
      System.out.println(f.exists());

    }
}
