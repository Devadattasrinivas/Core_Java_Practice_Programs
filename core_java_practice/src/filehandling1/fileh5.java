package filehandling1;
import java.io.*;
//copying from two files into 3rd file
public class fileh5 {
    public static void main(String[] args)throws IOException {
     File f=new File("CoArErTothis.txt");
     f.createNewFile();//use createnewfile to create new file or create obj of filewriter to create new file
    // FileWriter f1=new FileWriter(f);//use this compulsory to create file
     FileReader fr=new FileReader("Ar.txt");
     BufferedReader bf=new BufferedReader(fr);

//to  read from Ar file
      String line=bf.readLine();
     PrintWriter pw=new PrintWriter(f);
     while(line!=null){
       //  pw.write(i);write or println can be used
         pw.println(line);
         line=bf.readLine();
     }
//to read from Er file
      bf=new BufferedReader(new FileReader("Er.txt"));
      line=bf.readLine();
     while(line!=null){
         pw.println(line);
         line=bf.readLine();
     }
//to write complete data  into new file
        pw.flush();//if flush() not used operations not performd must and should while writing intoa file
        bf.close();//compulsory good practice
        pw.close();//compulsory good practice

        System.out.println("open CoArErTothis.txt file to see the output");


    }
}


