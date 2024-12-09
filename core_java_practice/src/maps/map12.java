package maps;
import java.util.*;
//checking passport num with already data  present ,if both same then shows found otherwise not found

class Passport{
    int sno;
    String name;
    String city;
    public Passport(int sno,String name,String city){
        this.sno=sno;
        this.name=name;
        this.city=city;
    }
    public int getSno(){
        return sno;
    }
    public String getName(){
        return name;
    }
    public String getCity(){
        return city;
    }
    public String toString(){
        return sno+" "+name+" "+city;
    }
}
public class map12 {
    public static void main(String args[]){
         boolean flag=false;
         Passport p=new Passport(1,"era","vijayawada");
         Passport p1=new Passport(2,"wera","banglore");
         HashMap h=new HashMap();
         h.put(33,p);
         h.put(34,p1);
         System.out.println("enter passport num");
         Scanner sc=new Scanner(System.in);
         Integer n=sc.nextInt();
         Set t=h.entrySet();//directly we cant access from hashmap so convert into set and iterate
         Iterator i=t.iterator();
         while(i.hasNext())
         {
             Map.Entry w=(Map.Entry)i.next();
             if(n==w.getKey()) {
                 flag = true;
                 System.out.println(w.getKey() + " " + w.getValue());
             }
         }
        if (flag == false) {
            System.out.println("not matched");
        }
    }
}
