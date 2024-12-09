package filehandling;
import java.io.*;
import java.util.Arrays;

//counting files jpg,png files
public class file7 {
    public static void main(String[] args) {
    String location="C:\\javaprograms";
     File f=new File(location);
     String[] names=f.list();
     int jpgfiles=0;
     int pngfiles=0;
     int directory=0;
     int files=0;
      for(String nam:names){

          File f1=new File(f,nam);
          if(f1.isDirectory()){
              directory++;
          }
          if(f1.isFile()){

              if(nam.endsWith(".jpg")){
                  jpgfiles++;
              }
              if(nam.endsWith(".png")){
                  pngfiles++;
              }
              if(nam.endsWith(".txt")){
                  files++;
              }
              System.out.println(nam);

          }

      }

        System.out.println(directory);
        System.out.println(jpgfiles);
        System.out.println(pngfiles);
        System.out.println(files);



    }
}
