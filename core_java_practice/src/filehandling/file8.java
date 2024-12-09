package filehandling;
import java.io.*;
//filewriter:if not exixts then create new file ,if file exits it will point  to that file and pointing can be done in 2 ways
//1.appending 2.overriding
public class file8 {
    public static void main(String[] args) throws IOException {
        File  f1=new File("erat.txt");
       // FileWriter f2=new FileWriter(f1);//for overriding  the data and adding new data
        FileWriter f2=new FileWriter(f1,true);//to append the new data to already existing adata
        //FileWriter f2=new FileWriter(f1,true);overriding
        f2.write(34);
        f2.write("\n");
        f2.write("hello sachin how r u?");
        f2.write("\n");
        char[] ch={'d','r','j','p'};
        f2.write(ch);
        System.out.println("open erat file in javaprograms directory to see the output");

        //if flush or close not used any one then operations above wont be successful and think data still pending
        //making the data to write to the file
        f2.flush();//when some data pending and yet to recive use flush
        //closing the resource
        f2.close();//all data received  in the file
    }
}
