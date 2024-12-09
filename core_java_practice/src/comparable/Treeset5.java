package comparable;
import java.util.*;
//write a program to insert employee objects into treeset where dnso
// is based on ascending order of empid and customized sorting order is based on alpha.. order
class Ecomparator implements Comparator{
   public int compare(Object o1,Object o2){
       Employee e1=(Employee) o1;
       Employee e2=(Employee) o2;

       String s1=e1.ename;
       String s2=e2.ename;
       //System.out.println(s2.compareTo(s1));
       return s1.compareTo(s2);
   }
}
class Employee implements Comparable{
   int eid;
   String ename;
   public Employee(int eid,String ename){
       this.eid=eid;
       this.ename=ename;
   }
    public String toString(){
        return eid+"====>"+ename;
    }
   public int compareTo(Object o1){//e2 passed
      //on any active obj  on heap jvm internally maintain the ref i.e this so this.id(as e1 is calling obj)
       int id1=this.eid;//first emp obj(e1)jvm has its ref already
       Employee s1=(Employee)o1;
       int id2=s1.eid;//sec emp obj(e2)
            if(id1<id2)
                return -1;
            else if(id1>id2)
                return +1;
            else
                return 0;
   }
}

public class Treeset5 {
    public static void main(String[] args) {//throws Exception
     //on any active obj  on heap along with the ref internally jvm wil also use the ref
     TreeSet ts=new TreeSet();
     Employee e1=new Employee(1,"era");
     Employee e2=new Employee(21,"wera");
     Employee e3=new Employee(3,"zera");

     ts.add(e1);//e1.compareTo(e2);//e1 current obj- on any active obj  on heap along with the ref internally jvm wil also use the ref(e1)
     ts.add(e2);
     ts.add(e3);

     System.out.println(ts+ "according to num in ascending");

    // System.in.read();

     TreeSet ts1=new TreeSet(new Ecomparator());
     ts1.add(e1);//compare(e1,e2)
     ts1.add(e2);
     ts1.add(e3);
     System.out.println(ts1+ "according to names  in descending");

    }
}
