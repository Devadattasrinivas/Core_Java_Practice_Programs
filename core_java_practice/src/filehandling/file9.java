package filehandling;
import java.io.*;
public class file9 {
    public static void main(String[] args) throws IOException {
        FileReader f=new FileReader("cindrella.txt");
        int i=f.read();

        while(i!=-1){//till i reaches end of file
            System.out.print((char)i);
             i=f.read();//incrrement of nxt char
        }
        System.out.println();


    }
}
