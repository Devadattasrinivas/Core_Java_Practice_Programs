package filehandling1;
import java.io.*;
//storing the data from the file into a char array and then (using it) reading it
public class fileh1 {
    public static void main(String[] args) throws IOException{
      File f=new File("erat.txt");
      FileReader f1=new FileReader(f);
      char[] ch=new char[(int)f.length()];//char array created wth size filelength after typecasting long type length() to int
      //now read that chars from file and store in char array
       f1.read(ch);
      for(char c:ch){
          System.out.println(c);
      }
       f1.close();
    }
}
