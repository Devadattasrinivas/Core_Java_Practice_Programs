package filehandling1;
import java.io.*;
//PrintWriter:we can store int,float,boolean unlike bufferwriter
//remembering newLine() always a hard better use println() in  printWriter to print in new line
//can communcicate directly with file or writer
public class fileh4prac {
    public static void main(String[] args)throws  IOException {
        File f=new File("arundati.txt");
        FileWriter f1=new FileWriter(f);
        PrintWriter pw=new PrintWriter(f1);

        pw.println(100);
        pw.println(90);
        pw.println(78.9);
        pw.println("PRINTWRITER");
        pw.println('c');

        pw.flush();
        pw.close();

    }
}
