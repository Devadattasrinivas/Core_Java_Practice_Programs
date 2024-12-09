package Annotation;

import java.util.*;
//built-in annotation
//anotation can be applied to fields/(instance var),methods,constructors,class,interafce,enum,parameters,local variables
//Annotations:built-in,customized
//comments:adding extra info to to our code after compilation they wont have power upto source
//annotations:adding extra info to our codeand to  reach extra info till compiler,jvm

//functional interface-maybe developer have not noticed so use annotation
@FunctionalInterface//annotation,target-interface
interface functional{
    int Num();
    // void disp();
}
class Java{
    void met(){
        System.out.println("jkl");
    }
}
class overriding extends Java{
    //overiding met
    // void met1(){//but not met  mismatching to avoid use annotation
    //System.out.println("asd");
    //}

    @Override//target:method
    void met(){
        System.out.println("overrr");
    }
}
public class  annotations{
    public static void main(String args[]){
        functional m1=()->{
            return 10;//just like implemented class giving body here
        };
        overriding o=new overriding();
        o.met();
    }
}