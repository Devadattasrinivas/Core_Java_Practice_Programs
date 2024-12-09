package filehandling1;
import java.io.*;
//remove duplicate numbs and print one time appeared numb in another file
public class fileh8prac {
    public static void main(String[] args)throws IOException {
        BufferedReader bf1 = new BufferedReader(new FileReader("asd1.txt"));
        String target = bf1.readLine();

        PrintWriter ot = new PrintWriter("outasd.txt");

        BufferedReader bf2=null;

        while (target != null) {
            boolean isAvailable = false;
            // boolean isAvailable = false;//while entering into the loop every new input is original value and when value changed in loop then it will not affect original variable value
            bf2 = new BufferedReader(new FileReader("asd2.txt"));
            String line = bf2.readLine();

            while (line != null) {
                if (line.equals(target)) {
                    isAvailable = true;
                    break;//will break if loop only
                }
                line = bf2.readLine();
            }

            if (isAvailable == false) {
                ot.println(target);
                ot.flush();
            }
            target = bf1.readLine();
        }

        bf1.close();
        bf2.close();
        ot.close();

    }
}