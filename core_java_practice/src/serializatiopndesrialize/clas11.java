package serializatiopndesrialize;
import java.io.*;
import java.util.StringTokenizer;
//used to split the entire string into multiple tokens using delimeter we supply
public class clas11 {
    public static void main(String[] args) {
        String s=new String("sachin ramesh tendulkar");//considered as one string pass into string tokenizer to convert into tokens
        System.out.println(s);
        StringTokenizer stk=new StringTokenizer(s," ");// without signifying " " delimeter it shows three words
        System.out.println(stk);
        int tokenCount= stk.countTokens();
        System.out.println(tokenCount);

        StringTokenizer stk1=new StringTokenizer("sachin$ramesh$tendulkar");//taken as one word
        int tokenCount1= stk1.countTokens();
        System.out.println(tokenCount1);

        StringTokenizer stk2=new StringTokenizer("sachin$ramesh$tendulkar","$");
        int tokenCount2= stk2.countTokens();
        System.out.println(tokenCount2);
        while(stk2.hasMoreTokens()){
            String data=stk2.nextToken();
            System.out.println(data);
        }

    }
}
