package comparable;
import java.util.*;
class Mcomparator implements Comparator {
    public int compare(Object o1,Object o2){
        employ e1=(employ)o1;
        employ e2=(employ)o2;
        String s1=e1.name;
        String s2=e2.name;
        return s1.compareTo(s2);
    }
}
//user-defined class
class employ implements Comparable{
    int id;
    String name;
    public employ(int id,String name){
        this.id=id;
        this.name=name;
    }
    @Override
    public int compareTo(Object o1){//e2 passed//s1.CompareTo(s2)only one object passed
        int id1=this.id;//e1's id
        employ ed=(employ)o1;//e2 obj//object conversion into employee type
        int id2=ed.id;//e2's id
        //return  id1.compareTo(id2);
        if(id1<id2)
            return -1;
        else if(id1>id2)
            return +1;
        else
            return 0;
    }
    public String toString(){
        return name+" ======> "+id;
    }


}
public class Treeset5prac {
    public static void main(String args[]) {
        TreeSet ts=new TreeSet();//based on numbers
        employ e1=new employ(1,"a");
        employ e2=new employ(5,"e");
        employ e3=new employ(3,"s");
        ts.add(e1);//e1.compareTo(e2)//calling e2 on e1 ref so jvm has e1 ref in the form of this keyword
        ts.add(e2);
        ts.add(e3);
        System.out.println(ts+ "based on numbers ascending" );



        TreeSet ts1=new TreeSet(new Mcomparator());//based on names alpha...ascending
        ts1.add(e1);
        ts1.add(e2);
        ts1.add(e3);
        System.out.println(ts1+" based on alphabe...");

    }
}
