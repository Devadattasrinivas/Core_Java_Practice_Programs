package collection;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Collections;


public class coll3prac {
    public static void main(String args[]){
        //desceding iterator-arraydeque,treeset,linkedlist
        TreeSet t=new TreeSet();
        t.add(10);
        t.add(20);
        t.add(30);
        Iterator i=t.descendingIterator();
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }
        System.out.println();
        Vector v=new Vector();
        v.add(1);
        v.add(2);
        v.add(3);
        Enumeration e=v.elements();
        while(e.hasMoreElements()){
            System.out.print(e.nextElement()+" ");
        }
        System.out.println();
        //concurrent modification illegal  while traversing can be prevented from execution in iterators not in for loops
        ArrayList ts=new ArrayList();
        ts.add(11);
        ts.add(12);
        ts.add(13);
        for(int i1=0;i1<ts.size();i1++){
            System.out.print(ts+" ");
           // ts.add(1);//concurrent modification exception not prevented from getting executed
        }

        //failfast
      //using iterators it has been stopped termed as failfast but unexcepted termination not good
        System.out.println();
      Iterator h=ts.iterator();
        while(h.hasNext()){
            System.out.print(h.next()+" ");
          //  ts.add(123);//termination
        }
        System.out.println();

        //failsafe:another copy of arraylist in concurrentpackage used when modifications made not allowed and succesfully executed
        CopyOnWriteArrayList c=new CopyOnWriteArrayList();
        c.add(33);
        c.add(44);
        c.add(55);
        Iterator y=c.iterator();
        while(y.hasNext()){
            System.out.print(y.next()+" ");
            c.add(123);//failedsafe notexecuted
        }
        System.out.println();
        ///////////////////////////

        TreeSet q=new TreeSet();
        q.add(22);
        q.add(2);
        q.add(1);
        System.out.println(q);//sorted
        System.out.println();
        //collections class to perform some operations in collection

        ArrayList w=new ArrayList();
        w.add(67);
        w.add(9);
        w.add(7);
        System.out.println(w);
        Collections.sort(w);
        System.out.println(w);
        int o=Collections.binarySearch(w,9);
        System.out.println(o);
        int j=Collections.frequency(w,7);
        System.out.println(j);
        Collections.shuffle(w);
        System.out.println(w);



    }
}
