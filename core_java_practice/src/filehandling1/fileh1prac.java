package filehandling1;
import java.io.*;
public class fileh1prac {
    public static void main(String[] args)throws IOException {
        File f=new File("erat.txt");
        FileReader f1=new FileReader(f);
        char ch[]=new char[(int)f.length()];
        f1.read(ch);
        for(char data:ch){
          System.out.print(data+" ");
        }
        f1.close();
    }
}
