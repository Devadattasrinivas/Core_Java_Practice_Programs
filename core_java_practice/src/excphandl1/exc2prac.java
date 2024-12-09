package excphandl1;
import java.io.*;

       // try(String s=new String("sachin")){
       //    System.out.println("hello");
       //}
        //rules:
        //1
       // try(BufferedReader br=new BufferedReader(new FileReader("sample.txt"),BufferedReader br=new BufferedReader(new FileWriter("fff.txt")))){
        // can have any no .of resources in try
       //}
        //2,3
       // try(BufferedReader br=new BufferedReader(new FileReader("sample.txt")){//br is treated as final reassign is not possible
       // //    br=new BufferedReader(new FileReader("sample.txt");//we cant reassign
        //}
       // try(R){} //without catch and finally is possible

        //try with multiple catch blocks

        /*
        try{
            new BufferedReader(new FileReader("sample.txt"));
        }
        catch(NullPointerException |ArithmeticException e){
            System.out.println("excp");
        }
         */

/*
class m1{
    public void w(){

    }
}
class m2 extends m1{
    public void w() throws NullPointerException,ArithmeticException{//unchecked excp no problem

    }
}
 class exc2prac {
    public static void main(String args[]) {

    }
}
 */
/*
class m1{
    public void w()throws Exception{

    }
}
class m2 extends m1{
    public void w() throws IOException{//checked excp in childs o throw same checkedexc in parent or parent of that exc
    }
}
class exc2prac {
    public static void main(String args[]) {

    }
}
 */

class exc2prac {
    public static void main(String args[]) throws ClassNotFoundException {
      exc2prac p=new exc2prac();
     // System.out.println(p instanceof exc2prac);
     // System.out.println(p instanceof Runnable);
    //  System.out.println(null instanceof String);//alwys false
      System.out.println(Class.forName(args[0]).isInstance(p));
       // System.out.println(Class.forName(args[0]).isInstance(p));
       // System.out.println(Class.forName(args[0]).isInstance(p));
    }
}