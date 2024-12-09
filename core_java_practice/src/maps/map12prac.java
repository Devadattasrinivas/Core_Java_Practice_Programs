package maps;
//checking visa num with already data  present ,if both same then shows found otherwise not found
import java.util.*;
class visa{
    private int nu;
    private String name;
    private String city;
    public visa(int nu,String name,String city){
        this.nu=nu;
        this.name=name;
        this.city=city;
    }
    public int getNu(){
        return nu;
    }
    public String getName(){
        return name;
    }
    public String getCity(){
        return city;
    }
    public String toString(){
        return nu+" "+name+" "+city;
    }
}
/*
class key{
    int k;
    public key(int k){
        this.k=k;
    }
    public String toString(){
        return k+"";
    }
}
 */

public class map12prac {
    public static void main(String args[]){
        boolean flag=false;
        visa v=new visa(1,"era","vijayawada");
        visa v1=new visa(2,"werra","banglore");

        HashMap h=new HashMap();
       // h.put(new key(1),v);
        //h.put(new key(2),v1);
        h.put(1,v);
        h.put(2,v);
        System.out.println("enter visa num");
        Scanner sc=new Scanner(System.in);
        int o=sc.nextInt();
        Set s=h.entrySet();
        Iterator i=s.iterator();
        while(i.hasNext())
        {
            Map.Entry me=(Map.Entry)i.next();//entry is an object covert into required type by type cas4// ting
            int m=(Integer)me.getKey();//covert obj type key to int type by using wrapper class conversion
            if(o==m)//o-int type,me.getKey()object type cant compare int-obj so see above line
            {
                System.out.println("visa "+me.getKey()+" found");
                flag=true;
                System.out.println(me.getKey()+" "+me.getValue());
            }
        }
        if(flag==false){
        System.out.println("visa not found");
        }
    }
}
