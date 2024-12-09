package filehandling;
import java.io.*;
/*
public class file6 {
    public static void main(String[] args) {
        String location="C:\\javaprograms";
        File f=new File(location);
        String[] names=f.list();
        int count=0;
        for(String n:names){
            System.out.println(n);
            count++;
        }
        System.out.println(count);
    }
}
 */
//to display all the files and direc in the particular drive
public class file6 {
    public static void main(String[] args) {
        String location="C:\\javaprograms";
        int dircount=0;
        int filecount=0;
        File f=new File(location);
        String[] names=f.list();
        int count=0;
        for(String n:names){
            //creating a file obj for the direc
            //C drive we are iterating
            File f1=new File(f,n);//check in this location in this filename//fileconstructor
            if(f.isDirectory()){
                dircount++;
            }
            if(f.isFile()){
                filecount++;
            }
            System.out.println(n);
            count++;
        }
        System.out.println(dircount+ " dir count");
        System.out.println(filecount+" file count");

    }
}
