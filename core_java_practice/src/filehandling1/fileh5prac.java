package filehandling1;
import java.io.*;
//copying from 2 files to third file
public class fileh5prac {
    public static void main(String[] args)throws IOException {
        BufferedReader bf=new BufferedReader(new FileReader("alia1.txt"));
        PrintWriter pw=new PrintWriter("alia12.txt");
        String line=bf.readLine();

        while(line!=null){
            pw.println(line);
            line=bf.readLine();

        }

        BufferedReader bf1=new BufferedReader(new FileReader("alia2.txt"));
        String line1=bf1.readLine();

        while(line1!=null){
            pw.println(line1);
            line1= bf1.readLine();
        }

        pw.flush();
        pw.close();
        bf.close();
        bf1.close();


    }
}
