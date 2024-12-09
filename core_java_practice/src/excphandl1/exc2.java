package excphandl1;
import java.io.*;

/*
public class exc2 {
    public static void main(String args[]){
        try(String s=new String("sachin"))
        {
            System.out.println(s);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
 */
/*
public class exc2 {
    public static void main(String args[]){
        try(String s=new String()){
            System.out.println(s);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
 */
/*
public class exc2 {
    public static void main(String args[]){
        try(final BufferedReader br=new BufferedReader(new FileReader("sample.txt"))){

        }//we can write without try too
        //catch(Exception e){

       // }

    }
}
 */

//try with multi_catch blockk if all handling codes are same(no parent-child rel should be there)
/*
public class exc2 {
    public static void main(String args[]) {
        try
        {
           int a=8/0;
           new BufferedReader(new FileReader("sample.txt"));
        }
        catch(ArithmeticException | NullPointerException | IOException e){
            System.out.println("exception");
            e.printStackTrace();
        }
}
}
 */
/*
//child class method  when throws checked exception parent class method also should throws same checked exception or its parent
class m1{
    public void q() throws Exception{

    }
}
class m2 extends m1{
    public void q() throws Exception{

    }
}
public class exc2 {
    public static void main(String args[]) {

    }
}
 */
//throws checked excp in child class method,should throws same checkedexcp or parent of it
/*
class m1{
    public void q() throws Exception{

    }
}
class m2 extends m1{
    public void q() throws IOException{

    }
}
public class exc2 {
    public static void main(String args[]) {

    }
}
 */
/*
class m1{
    public void q() throws Exception{

    }
}
class m2 extends m1{
    public void q(){

    }
}
public class exc2 {
    public static void main(String args[]) {

    }
}
 */

//child class overriden method can throws unchecked exceptions
/*
class m1{
    public void q() {

    }
}
class m2 extends m1{
    public void q() throws ArithmeticException,NullPointerException{

    }
}
public class exc2 {
    public static void main(String args[]) {

    }
}
 */

//instanceof(type instanceof refdata)
public class exc2 {
    public static void main(String args[])throws ClassNotFoundException {
        // Thread t=new Thread();//runnable obj is thread which is after new
      //   System.out.println(t instanceof Object);//thread,obj true(thread,obj there is a relship like child-parent/parent-child )
      //  System.out.println(t instanceof Thread);//thread,thread same
      //  System.out.println(t instanceof Runnable);//wr to interface always true
        //System.out.println(t instanceof String);
        //System.out.println(null  instanceof Runnable);//null-always false

        //if we are checking from parent to child always false
       // Object o=new Object();//obj-string parent to child relship false
       // System.out.println(o instanceof String);

       // Object o=new String("Deva");
       // System.out.println(o instanceof String);//string with string(true)

      //isinstance-when we dont know particular type of obj at beginning & avail dyn at runtime

        exc2 e=new exc2();
        System.out.println(e instanceof exc2);//true
        //load class file dyn
       // System.out.println(Class.forName(args[0]).isInstance(e));//at runtime give java.lang.string(string-exc2 not same type so false)
        System.out.println(Class.forName(args[0]).isInstance(e));//java.langg.obj(obj-exc2)same type//true
        System.out.println(Class.forName(args[0]).isInstance(e));//java.lang.exception//false
    }
}
