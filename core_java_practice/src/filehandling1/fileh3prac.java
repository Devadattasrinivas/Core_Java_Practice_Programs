package filehandling1;

import java.io.*;
public class fileh3prac {
    public static void main(String[] args) throws IOException{
        FileReader fr=new FileReader("prerag.txt");
        BufferedReader br=new BufferedReader(fr);

        String i=br.readLine();
        while(i!=null){
            System.out.print(i+" ");
            i=br.readLine();
        }
        br.close();
    }
}
