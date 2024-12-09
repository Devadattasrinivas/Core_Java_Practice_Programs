package filehandling1;
import java.io.*;
//BufferedWriter  better than FileWriter
//replacement of newLine() for "\n" as "\n" not works in all systems

public class fileh2prac {
    public static void main(String[] args) throws IOException{
        File f=new File("prerag.txt");
        FileWriter f1=new FileWriter(f);
        BufferedWriter bw=new BufferedWriter(f1);

        bw.write(100);//corresponding unicode  printed
        bw.newLine();//replacement of("\n") by newLine()  in bufferedWriter
        bw.write("how are u?");
        bw.newLine();
        bw.write('j');
        bw.newLine();
        char[] c={'f','l','u','s','h'};
        bw.write(c);

        bw.flush();
        bw.close();



    }
}
