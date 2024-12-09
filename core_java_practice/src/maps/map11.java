package maps;
import java.security.KeyStore;
import java.util.*;
class Student{
    private String num;
    private String name;
    private String city;
    public Student(String num,String name,String city){
        this.num=num;
        this.name=name;
        this.city=city;
    }
    public String getNum(){
        return num;
    }
    public String getName(){
       return name;
    }
    public String city(){
        return city;
    }

    @Override//annotation to avoid mismatch
    public String toString(){
        return num+" "+name+" "+city;//if sae return type allowed in one statement
    }

}
public class map11 {
    public static void main(String args[]){
        Student s1=new Student("7","deva","vijay...");
        Student s2=new Student("8","darh..","vijay...");
        Student s3=new Student("9","vishnu","vijaya...");

       HashMap h=new HashMap();
       // h.put(s1);obj not in(k,v) form
        h.put(11,s1);//entry
        h.put(22,s2);
        h.put(33,s3);
       // h.put(44,"eva");
        System.out.println(h);//println will call toString() internally so hashcode is returning  so override toString() to print value


        LinkedHashMap lh=new LinkedHashMap();
        lh.put(1,"wer");//entry
        lh.put(2,"era");
        lh.put(3,"der");
        //can go with collection if u only want values
        //accessing only values
       Collection c= lh.values();//values set return collection of values of type collection
       Iterator i=c.iterator();
       while(i.hasNext()){
          // System.out.println(i.next());//returning obj
           String x=(String)i.next();//want String not obj
           System.out.println(x);//i.next()is an obj gets only values

       }
       //getting only keys
        //accessing pnly keys
       Set t=lh.keySet();
       Iterator w=t.iterator();
       while(w.hasNext()){
           //System.out.println(w.next());//returning as obj
           Integer f=(Integer)w.next();//returning as integer(becoz we want that particular type
           System.out.println("key "+f);
       }
       //both key and values
       Set r=lh.entrySet();
       Iterator y=r.iterator();
        while(y.hasNext()){
            //System.out.println(y.next());as an obj
            Map.Entry z=(Map.Entry) y.next();//returning as a entry ,innerinterface(entry) can be accessed with outer interface map(to access inside data  use(.))
            System.out.println(z.getKey()+" "+":"+z.getValue());
        }
    }
}
