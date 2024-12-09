package filehandling1;
import java.io.*;
public class fileh9prac {
    public static void main(String[] args)throws IOException {
        BufferedReader bf1=new BufferedReader(new FileReader("Er.txt"));
        int maxLength=0;
        String result=" ";
        String line=bf1.readLine();
        while(line!=null){
            int reslength=line.length();
            if(maxLength<reslength){
                maxLength=reslength;
                result=line;
            }
            line=bf1.readLine();
        }
        System.out.println(maxLength+" "+result);

    }
}
