package filehandling1;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
//using buffereader reading from a file
public class fileh3 {
    public static void main(String[] args) throws IOException {
        FileReader f=new FileReader("cindrella.txt");
        BufferedReader br=new BufferedReader(f);
        String line=br.readLine();//reading a line from a line
        while(line!=null){
            System.out.println(line);//printing
            line= br.readLine();//reading nxt line (increment cond)in while
        }
           br.close();
    }
}
