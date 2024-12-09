package filehandling;
import java.io.*;
public class file9prac {
    public static void main(String[] args) throws IOException {

        FileReader f1=new FileReader("cindrella.txt");
        int i=0;
        while(i!=-1){
             i=f1.read();
            System.out.println(i+"="+(char)i);
           // i=f1.read();
          System.out.println(i);
        }
    }
}
