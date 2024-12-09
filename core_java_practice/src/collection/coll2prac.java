package collection;
import java.util.*;
//every class in collection uses a specific datastructure to store the data
//so to  fetch the data fast from any class in collection, it depends on the datastructure
public class coll2prac {
    public static void main(String args[]){
        //if we want highest prority to be in the first place among all
        PriorityQueue p= new PriorityQueue();
        p.add(120);
        p.add(34);
        p.add(77);
        System.out.println(p);

        //if we want all the numb in the  ascend format
        TreeSet t=new TreeSet();
        t.add(13);
        t.add(90);
        t.add(78);
        t.add(66);
        System.out.println(t);
        System.out.println(t.ceiling(12));
        System.out.println( t.floor(55));
        System.out.println( t.higher(55));
        System.out.println( t.lower(55));


        //order of insertion not preserved but can search data very fast
        HashSet h=new HashSet();
        h.add(12);
        h.add(5);
        h.add(11);
        //order of insertion preserved but can search data very fast
        LinkedHashSet h1=new LinkedHashSet();
        h1.add(67);
        h1.add(89);
        h1.add(33);
        System.out.println(h1);
      //diff ways to get data  using loops
        ArrayList a=new ArrayList();
        a.add(88);
        a.add(11);
        a.add(90);
        //any class in collection when traversed do whatever there in the body of the loop
       // for(int i=0;i<a.size();i++){
         //   System.out.print(a.get(i)+" ");
        //}
        //when iterator used it will go and fetch the data and printing it
        //priting on console diff from getting the data
        Iterator w=a.iterator();
        while(w.hasNext()){
            System.out.print(w.next()+" ");
        }
        System.out.println();
        //we can use iterators to fetch data in forward direc
        ArrayDeque r=new ArrayDeque();
        r.add(2);
        r.add(8);
        r.add(1);
        LinkedList k=new LinkedList();
        k.addAll(r);
        //to access the collection in reverse order only possible in list based arraylist and linkedlist classes,if we want data other classes data in reverse copy into these listbase classes and perform iteration
        ListIterator e=k.listIterator(k.size());
        while(e.hasPrevious()){
            System.out.print(e.previous()+ " ");
        }
    }
}
