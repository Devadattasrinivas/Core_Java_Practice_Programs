package generic;
import java.util.*;
public class gen1 {
    public static void main(String args[]){
        //storing
       //Arrays typesafety
       String[] s1=new String[12];
       s1[0]="era";
       s1[1]="wera";
     //  s1[2]=new Integer(10);//ce
       //retrieving the data
       String a=s1[0];
       String b=s1[1];
       String c=s1[2];//typecasting not required

        //storing the data
       //Collections not typesafety
       ArrayList al=new ArrayList();//typecasting  required
       al.add("www");
       al.add("erw");
      // al.add(new Integer(10));
      // al.add(11);//results in classcastexception
        //assuming data stored a string and retrieving as a string
       //typecasting required
       String s11=(String)al.get(0);//everything in arraylist obj so
       String s22=(String)al.get(1);//get() rteurn object so typecasting as string and storing in String assuming that data present in arraylist in String
       //String s33=(String)al.get(2);

       //use generics
       //Arrays: directly deals the data at memory level
       //generics:deals data through api code
       /*
       class ArrayList{
          add Object(Object o);
          Object get(int index);
       }
        */
       /*
       class ArrayList<String>{
          add(String aq);
          String getaq(int index);
       }
        */
       ArrayList<String> aq=new ArrayList<String>();
       aq.add("qsa");
       aq.add("dsa");
      // aq.add(12);//ce

       String d11=aq.get(0);//typecasting not req
       String d22=aq.get(1);

      //<String>-type parameter(should be same),List-base parameter(Can be diff)

       //polymorphism prent ref to child obj
       List<String> w1=new ArrayList<String>();
      // List<Object> w2=new LinkedList<String>();//cant allowed
       Collection w3=new Stack();
      // List<int> w4=new Vector<int>(); invalid(primitive type data not allowed in collections)
       List<Integer> w5=new Vector<Integer>();


    }
}
