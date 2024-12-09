package filehandling1;
//find max length of a highest Stribg and max Sti=ring
import java.io.*;
public class fileh9 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new FileReader("Ar.txt"));
        String data=bf.readLine();
        int maxLength=0;
        String result=" ";//taking an empty string

        while(data!=null){
            System.out.println(data);
            int reslength=data.length();
            if(maxLength<reslength){
                maxLength=reslength;
                result+=data;//adding highest string to result
            }
            data=bf.readLine();
        }

        System.out.println(maxLength+" "+result);

    }
}
