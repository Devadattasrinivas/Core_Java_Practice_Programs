package maps;
import java.util.*;
class Parent{
   private  int age;
   private String name;
   private String city;
   public Parent(int age,String name,String city){
       this.age=age;
       this.name=name;
       this.city=city;
   }
    public int getAge(){
       return age;
    }
    public String getName(){
       return name;
    }
    public String getCity(){
       return city;
    }
    @Override
    public String toString(){
       return age+" "+name+" "+city;
    }
}
public class map11prac {
    public static void main(String args[]){
        Parent p=new Parent(1,"era","vijay..");
        Parent p1=new Parent(2,"wer","hyd");
        Parent p2=new Parent(3,"qwe","fer");

        LinkedHashMap q=new LinkedHashMap();
        q.put(1,p);
        q.put(2,p1);
        q.put(3,p2);
        System.out.println(q);
        //to access values
        /*
        Collection c=q.values();
        Iterator i=c.iterator();
        while(i.hasNext()){
           String  res=(String)i.next();
            System.out.println(res);
        }
         */
        //to access keys(wont possible to access values when separate copy of other class obj passed in map )
        /*
        Set e=q.keySet();(wont possible to access keys when separate copy of other class obj passed in map)
        Iterator i1=e.iterator();
        while(i1.hasNext()){
           Integer n=(Integer)i1.next();
            System.out.println(n);
            //System.out.println(i1.next());
        }
         */
        //to access both key and value(can access entry only when separate copy of other class obj passed in map)
       Set a=q.entrySet();
       Iterator i2=a.iterator();
       while(i2.hasNext()){
           Map.Entry res=(Map.Entry) i2.next();
           System.out.println(res.getKey()+": "+res.getValue());
       }
        System.out.println("****************************");
       LinkedHashMap m=new LinkedHashMap();
       m.put(1,"era");
       m.put(3,"wer");
       //to access values
       Collection c1=m.values();
       Iterator s=c1.iterator();
       while(s.hasNext()){
           String re=(String)s.next();
           System.out.println(re);
       }
        System.out.println("******************");

        //to access keys
        Set c2=m.keySet();
       Iterator s1=c2.iterator();
       while(s1.hasNext()){
           Integer re=(Integer)s1.next();
           System.out.println(re);
       }
        System.out.println("******************");

        //to access entry (pair)
        Set c3=m.entrySet();
       Iterator s2=c3.iterator();
        while (s2.hasNext()) {
           Map.Entry re=(Map.Entry) s2.next();
           System.out.println(re.getKey()+":"+re.getValue());
        }

    }
}
