package functinterandstreamapi;
import java.util.*;

//dem use of foreach to print all elem
public class fun8 {
    public static void main(String[] args) {
     ArrayList<String> al=new ArrayList();
     al.add("sachin");
     al.add("kohli");
     al.add("dhoni");
     //public void forEach(java.util.function.Consumer<? super E>)
        /*public myConsumer implements Consumer<String>{
          public void accept(T t);//accepts anything return nothing
        }
         */
     // public abstract void accept(T t)
    // al.forEach(System.out::println);//System.out::println-accept() body is calling here
     al.forEach(name->System.out.println(name));//same as above //lamda expal.forEach(System.out::println);//met ref :binding println body present in system.out





    }
}
