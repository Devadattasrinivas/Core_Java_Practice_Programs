package filehandling1;
import java.io.*;
//in 2 files compare and check duplicates and write one time appeared in new file
public class fileh8 {
    public static void main(String[] args)throws IOException {
        BufferedReader bf1 = new BufferedReader(new FileReader("input1.txt"));//file 1
        PrintWriter pw = new PrintWriter("output.txt");
      //  boolean isAvailable = false;

        String target = bf1.readLine();
        BufferedReader bf2=null;
        while (target != null) {
            boolean isAvailable = false;
            //boolean isAvailable = false;
            System.out.println(isAvailable +" "+target);
            bf2 = new BufferedReader(new FileReader("input2.txt"));//file2
            String line = bf2.readLine();

            while (line != null) {

                if (line.equals(target)) {
                    isAvailable = true;
                    break;//will break if loop only
                }
                line = bf2.readLine();
            }

            if (isAvailable == false) {
                pw.println(target);
                pw.flush();
            }
            target = bf1.readLine();
        }
        bf1.close();
        bf2.close();
        pw.close();

    }
}
