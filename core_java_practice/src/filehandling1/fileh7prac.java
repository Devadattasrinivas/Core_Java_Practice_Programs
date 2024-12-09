package filehandling1;
import java.io.*;
public class fileh7prac {
    public static void main(String[] args)throws IOException {
        File f=new File("dup.txt");
        f.createNewFile();
        File f1=new File("reemove.txt");
        f1.createNewFile();

        PrintWriter pw=new PrintWriter(f);
        pw.println(111);
        pw.println(888);
        pw.println(111);
        pw.println(777);
        pw.println(444);
        pw.flush();

        PrintWriter ce=new PrintWriter(f1);

         BufferedReader bf1=new BufferedReader(new FileReader("dup.txt"));
         String target= bf1.readLine();
         BufferedReader bf2=null;
         while(target!=null){
             boolean isAvailable=false;
            bf2=new BufferedReader(new FileReader("reemove.txt"));
             String line=bf2.readLine();
             while(line!=null) {
                 if (target.equals(line)) {
                     isAvailable = true;
                     break;
                 }
                 line = bf2.readLine();
             }

             if(isAvailable==false){
                 ce.println(target);
                 ce.flush();
             }
              target=bf1.readLine();
         }


        ce.close();
        bf2.close();


    }
}
