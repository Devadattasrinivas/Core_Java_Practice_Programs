package filehandling1;
import java.io.*;
import java.io.*;
//copying one line from first file  and other line from second file likewise
public class fileh6 {
    public static void main(String[] args)throws IOException {
        File f=new File("AltCoArEr.txt");
        f.createNewFile();//use createnewfile to create new file or create obj of filewriter to create new file
        // FileWriter f1=new FileWriter(f);//use this compulsory to create file
        FileReader fr=new FileReader("Ar.txt");
       // BufferedReader bf=new BufferedReader(fr);
        PrintWriter pw=new PrintWriter(f);
 //to  read from Ar file
        BufferedReader bf=new BufferedReader(fr);
        String line=bf.readLine();

 //to read from Er file

        BufferedReader bf1=new BufferedReader(new FileReader("Er.txt"));
        String line1=bf1.readLine();
        //when both files have equal  lines ok but if have unequal lines  and one file reach null contains null value and prints null until other file reaches end of the file
        /*
        while(line!=null || line1!=null){
            pw.println(line);
            line=bf.readLine();
            pw.println(line1);
            line1= bf1.readLine();
        }
         */
        //when both files have unequal  lines

        while(line!=null || line1!=null){
            if(line!=null) {
                pw.println(line);
                line = bf.readLine();
            }
            if(line1!=null) {
                pw.println(line1);
                line1 = bf1.readLine();
            }
        }


//to write complete data  into new file
        pw.flush();//if flush() not used operations not performd must and should while writing intoa file
        bf.close();//compulsory good practice
        pw.close();//compulsory good practice

        System.out.println("open CoArErTothis.txt file to see the output");


    }
}