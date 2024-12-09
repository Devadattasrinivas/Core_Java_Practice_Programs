package serializatiopndesrialize;
import java.io.*;
import java.util.StringTokenizer;

public class clas11prac {
    public static void main(String[] args) {
        String data="dalamo dalamo";
        System.out.println(data);
        StringTokenizer st=new StringTokenizer(data);
        System.out.println(st);
        int n=st.countTokens();
        System.out.println(n);

        while(st.hasMoreTokens()){
            String s=st.nextToken();
            System.out.println(s);
        }


    }
}
