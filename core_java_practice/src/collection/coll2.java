package collection;
import java.util.*;
public class coll2 {
    public static void main(String args[]){
        PriorityQueue q=new PriorityQueue();
        q.add(10);
        q.add(56);
        q.add(0);
        q.add(1);
       // System.out.println(q);
        System.out.println("*******************");
        TreeSet t=new TreeSet();
        t.add(12);
        t.add(11);
        t.add(90);
        t.add(55);
        t.add(3);
        System.out.println(t.ceiling(10));
        System.out.println(t.floor(10));
        System.out.println(t.higher(10));
        System.out.println(t.lower(10));

        HashSet h=new HashSet();
        h.add(34);
        h.add(1);
        h.add(67);
        h.add(77);
        System.out.println(h);
       // LinkedHashSet l=new LinkedHashSet();
        ArrayList l=new ArrayList();
        l.add(7);
        l.add(0);
        l.add(3);
       // System.out.println(l);
       // for(int i=0;i<l.size();i++){
           // Object o=l.get(i);
          //  System.out.println(o);
        //}
       // for(Object o:l){
       //     System.out.println(o);
       // }
        Iterator i=l.iterator();
       // if(i.hasNext()==true){
        //    System.out.println(i.next());
        //}
       // while(i.hasNext()){
        //    System.out.println( i.next());
        //}
          //arraylist and linkedlist can be accessed  in reverse using listiterator
        ListIterator p=l.listIterator(l.size());
        while(p.hasPrevious()){
            System.out.println(p.previous());
        }

        ArrayDeque a=new ArrayDeque();
        a.add(12);
        a.add(11);
        a.add(78);
       // System.out.println(a);
       // Iterator r=a.iterator();
        //while(r.hasNext()){
          //System.out.println(r.next());
       //}
        LinkedList m=new LinkedList();
        m.addAll(a);
       //System.out.println(m);
        ListIterator f=m.listIterator(m.size());
        while(f.hasPrevious()){
            System.out.print(f.previous()+"  ");
        }

        PriorityQueue k=new PriorityQueue();
        k.add(10);
        k.add(15);
        k.add(1);
        k.add(90);
        k.add(95);
        System.out.println(k);




    }
}
