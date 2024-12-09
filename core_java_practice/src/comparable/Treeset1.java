package comparable;
import java.util.*;
//for numb,String default natural sorting is ascending order
        /*
       TreeSet ts=new TreeSet();
       ts.add("A");//compareTo() internally called on String obj  by comparable interface
       ts.add("Z");//internally ("A".compareTo("Z")) by jvm//no need to implement comparable interface implemented by the wrapper classes automatically
       ts.add("P");//
       ts.add("U");
       System.out.println(ts);
         */

//compareTo():obj1.compareTo(obj2)ascending
//returns :-ve if obj1 should come before obj2 eg:(A.compareTo(Z))(A,Z)(2,3)-ve
//returns :+ve if obj1 should come after  obj2 eg:(D.compareTO(C))(D,C)(5,4):+ve
//returns :0 if both are equal(D,D)
//constructing binary tree:-ve means the node should be left
//                        :+ve means the node should be right
//                        :0  meansduplicates
//compare():obj1.compare(obj2)//reverse of compareTO(for descending)
//returns :+ve if obj1 should come before obj2 eg:(A.compareTo(Z))(A,Z)(2,3):+ve
//returns :-ve if obj1 should come after  obj2 eg:(D.compareTO(C))(D,C)(5,4):-ve
//returns :0 if both are equal(D,D)
        /*
        //natural sorting
        interface comparable{
            public int compareTo(Object obj);
        }
        //customized sorting
        interface comparator{
            public int compare(Object obj1,Object obj2);
            public boolean equals(Object obj);
        }

         */

class   MyComparator implements  Comparator
{
    @Override
    public int compare(Object obj1,Object obj2){
      Integer i1=(Integer)obj1;//covert objects into integers
      Integer i2=(Integer)obj2;
      /*//for descending
     if(i1<i2){
         return +1;//reverse of compareTo
     }else if(i1>i2){
         return -1;
     }else{
         return 0;
     }

       */
     /*//for ascending(to compare  userdefined objs in ascending)
        if(i1<i2){
            return -1;//reverse of compareTo
        }else if(i1>i2){
            return +1;
        }else{
            return 0;
        }
      */
        //return i1.compareTo(i2);//internally used method for ascending can use this too//ascending//prefarable
        //return -i1.compareTo(i2);//descending

        // return i2.compareTo(i1);//descending//preferable
        //return  -i2.compareTo(i1);//ascending
       // return +1;//right skewed binary  side how inserted that willbe o/p
        // return -1;//left skewed binary  side how inserted reverse of that willbe o/p
      return 0; //everying willbe assumed as -first element only
    }

}
public class Treeset1 {
    public static void main(String[] args) {

        TreeSet ts=new TreeSet(new MyComparator());//pass obj of comparator here
        ts.add(10);
        ts.add(8);
        ts.add(9);
        ts.add(3);
        System.out.println(ts);
       //System.out.println(("A".compareTo("M")));//(A,M):-ve
      // System.out.println(("S".compareTo("F")));//(S,F):+ve
       //System.out.println(("D".compareTo("J")));//(D,J):-ve
      // System.out.println("Z".compareTo(null));nullpointerexc...



    }
}
