package collection;
import java.util.*;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Enumeration;
//import java.util.Collect
import java.util.concurrent.CopyOnWriteArrayList;

public class coll3 {
    public static void main(String args[]){
        //linkedlist,arraydeque and treeset
        LinkedList l=new LinkedList();
        l.add(100);
        l.add(200);
        l.add(300);
        //System.out.println(l);
        Iterator i1=l.descendingIterator();
        while(i1.hasNext()){
            System.out.println(i1.next());
        }
        System.out.println("-------------------------");

        Vector v=new Vector();
        v.add(1);
        v.add(2);
        v.add(3);
        Enumeration e=v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }


        /*
        List l1=new LinkedList();
        Queue q1=new ArrayDeque();
        Set s1=new TreeSet();
        Collection c=new LinkedList();
       // c.peek();

         */
/*
        ArrayList a=new ArrayList();
        a.add(1);
        a.add(2);
        a.add(3);
        
 */
        /*
        for(int i=0;i<a.size();i++){
            System.out.println(a);
            a.add(111);
        }
         */
        //failfast
        /*
        Iterator w=a.iterator();
        while(w.hasNext()){
            System.out.println(w.next());
            a.add(111);
        }
         */
         //failsafe
        /*
        CopyOnWriteArrayList o=new CopyOnWriteArrayList();
        o.add(11);
        o.add(12);
        o.add(13);
        Iterator u=o.iterator();
        while(u.hasNext()){
            System.out.println(u.next());
            o.add(1222);
        }

         */

        TreeSet t=new TreeSet();
        t.add(12);
        t.add(11);
        t.add(56);
        t.add(55);
        System.out.println(t);

        ArrayList d=new ArrayList();
        d.add(12);
        d.add(11);
        d.add(56);
        d.add(55);
        System.out.println(d);
        Collections.sort(d);
        System.out.println(d);

        ArrayList<String>p=new ArrayList<String>();
      //  p.add(1);
        p.add("najafi");
        Collections.sort(p);
        System.out.println(p);
        ArrayList<Integer> y=new ArrayList<Integer>();
        y.add(7);
        y.add(4);
        y.add(1);
        System.out.println(y);



    }
}
