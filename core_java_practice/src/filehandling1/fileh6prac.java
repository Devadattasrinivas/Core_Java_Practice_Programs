package filehandling1;
import java.io.*;

public class fileh6prac {
    public static void main(String[] args) throws IOException{
      BufferedReader bf1=new BufferedReader(new FileReader("alia1.txt"));
      BufferedReader bf2=new BufferedReader(new FileReader("alia2.txt"));
      PrintWriter pw=new PrintWriter("all.txt");

      String line1= bf1.readLine();
      String line2=bf2.readLine();

      while(line1!=null || line2!=null ){

         if(line1!=null) {
              pw.println(line1);
              line1 = bf1.readLine();
          }
         if(line2!=null){
             pw.print(line2);
             line2=bf2.readLine();
         }

      }
      pw.close();
      bf1.close();
      bf2.close();

    }
}
