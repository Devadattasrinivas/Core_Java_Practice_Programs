package stringpack;
import java.util.*;
/*
class Demo{
    Demo(){
        System.out.println("constructor called");
    }
}
public class instVarConst {
    Demo d=new Demo();//first inst var will be given memory
    instVarConst(){
        System.out.println("inst called");

    }
   //inst var it will be called at the time of obj creation of main
    public static void main(String args[]){
        instVarConst i=new instVarConst();//const called called

    }
    */
public class instVarConst {

    //inst var it will be called at the time of obj creation of main
    public static void main(String args[]) {
        StringBuffer s1 = new StringBuffer("asd");
       // s1.append(3,"jhfj");
        StringBuffer s2 = new StringBuffer("asd");

        System.out.print(s1.equals(s2));//stringbUFFER compares references not objs

        //corresponding ascii values are printed when har stored in int
        int[] a={'a','b','c'};
        for(int ele:a){
            System.out.print(ele+" ");

        }
    }
}

