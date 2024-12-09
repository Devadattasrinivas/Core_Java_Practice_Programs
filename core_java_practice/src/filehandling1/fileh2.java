package filehandling1;
import java.io.*;
//BufferedWriter  better than FileWriter
//replacement of newLine() for "\n" as "\n" not works in all systems
//BufferedReader directly cant read/write with file   directly  only communicate via  with filewriter  or filereader
public class fileh2 {
    public static void main(String[] args)throws IOException {
    FileWriter f=new FileWriter("sachin.txt",true);
    BufferedWriter b1=new BufferedWriter(f);
    b1.write("hello");
    b1.newLine();

    char ch[]={'p','f','k'};
    b1.write(ch);
    b1.newLine();

    b1.write("how are u?");
    b1.newLine();

    b1.write("fine");
    b1.flush();//to make sure operation succesful
    b1.close();//interbally f1.close() will happen
    }
}
