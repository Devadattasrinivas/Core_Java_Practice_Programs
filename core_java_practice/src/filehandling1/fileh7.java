package filehandling1;
import java.io.*;
//remove duplicate numbs and print one time appeared numb in another file
public class fileh7 {
    public static void main(String[] args)throws IOException {
        BufferedReader bf1 = new BufferedReader(new FileReader("duplicates.txt"));
        PrintWriter pw = new PrintWriter("remdupli.txt");
        //boolean isAvailable = false;//if written as global then  changed value in any function /loop will be replaced by original value and used in same/other functions which will effect original value

        String target = bf1.readLine();
        BufferedReader bf2=null;
        while (target != null) {
            boolean isAvailable = false;//while entering into the loop every new input is original value and when value changed in loop then it will not affect original variable value
           bf2 = new BufferedReader(new FileReader("remdupli.txt"));
            String line = bf2.readLine();

            while (line != null) {//looping in remdupli  for searching duplicates
                if (line.equals(target)) {
                    isAvailable = true;
                    break;//will break if loop only
                }
                line = bf2.readLine();//incrementing to nxtline in remdupli file
            }

        if (isAvailable == false) {
            pw.println(target);//writing target from duplicates file to remdupli file
            pw.flush();
        }
        target = bf1.readLine();//incrementing  to nxt line in duplicates file
    }

      bf2.close();
      pw.close();

    }
}
