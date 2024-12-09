package collection;
import java.util.*;
public class coll1 {
    public static void main(String args[]){
        /*
        ArrayList a=new ArrayList();
        a.add(23);
        a.add(0,45);
        a.add(56.7);
        System.out.println(a);
        ArrayList b=new ArrayList();
        b.addAll(a);
        System.out.println(b);
        System.out.println(b.contains(23));
        b.add(23);
        System.out.println(b);
        b.add(0,11);
        System.out.println(b);
        b.ensureCapacity(12);
        System.out.println(b.size());
        b.trimToSize();
        System.out.println(b.get(0));
        System.out.println(b.getClass());
        b.clear();
        System.out.println(b);
         */

        /*
        LinkedList l=new LinkedList();
        l.add(10);
        l.addFirst(12);
        l.addLast("deva");
        System.out.println(l);
        System.out.println(l.indexOf(12));
        l.add(12);
        System.out.println(l.lastIndexOf(12));
        System.out.println(l.peek());
        System.out.println(l.pollFirst());
        System.out.println(l);
        l.offer(56);
        l.offerFirst(111);
        l.offerLast(113);
        System.out.println(l);
         */
       // LinkedList e=new LinkedList(8);
        //e.add(0);
       // e.add(1);
       // System.out.println(e);

        LinkedList e=new LinkedList();
        e.add(1);
        e.add(8);
        System.out.println(e);

        ArrayDeque y=new ArrayDeque(3);
        y.add(34);
        y.addFirst(11);
        y.addLast(67);
        System.out.println(y);
        y.addAll(e);
        System.out.println(y);




    }
}
