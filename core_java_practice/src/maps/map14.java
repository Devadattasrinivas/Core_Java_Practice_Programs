package maps;
import java.util.*;
class Ineuron{
    int i;
    public Ineuron(int i){
        this.i=i;
    }
    public String toString(){
        return i+"";
    }
}
public class map14 {
    public static void main(String args[]){
        Hashtable h=new Hashtable();
        h.put(new Ineuron(1),"era");
        h.put(new Ineuron(2),"wera");
        System.out.println(h);
    }
}
