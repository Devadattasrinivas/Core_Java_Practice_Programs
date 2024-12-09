package generic;
import java.util.*;
public class gen1prac {
    public static void main(String args[]){
        //Arrays:typesafety,no typecasting req while retrieving same data
        //store in string array
        String[] a=new String[3];
        a[0]="ewq";
        a[1]="kil";

        //retrieve again in string
        String s=a[0];
        String s1=a[1];

        //collection :notypesafety,typecasting requi..
        //store
        ArrayList al=new ArrayList();
        al.add("edc");
        al.add("bnm");

        //retrieve
        String z=(String)al.get(0);//get() return object so typecasting as string and storing in String assuming that data present in arraylist in String
        String z1=(String)al.get(1);

        //use generics:typesafe,no typecasting req
        ArrayList<String> j=new ArrayList<String>();
        j.add("api");
        j.add("jkl");

        String y=j.get(0);
        String y1=j.get(1);
        System.out.println(y);
        System.out.println(y1);


    }
}
