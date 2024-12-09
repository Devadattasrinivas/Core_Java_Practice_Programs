package enums;
import java.util.*;

//separate class for every enum
enum Result{
        //all are static final(all three constants)
        PASS,FAIL,NR;//these are variables itself and their values too
        //fields,methods,constructors
        //for every constant there will be a clobj created i.e that many constructors will be created
        //public static final Result PASS=new Result();(behind the scenes)//creating obj for result class
        //public static final Result FAIL=new Result();//we can call all internal methods of result if pass,fail,nr objs created
        //public static final Result NR=new Result();
        private Result(){//public,deafult access modifier not allowed in enum,private
            System.out.println("constructor invoked");
        }
}
public class    enum1 {
        //can have enums in class
        // enum Gender{
        //GIRL,BOY,OTHERS;
        //}
         public static void main(String args[]){
           Result re= Result.PASS;
           System.out.println(re);//pass itself value for pass var

            Result[] arr= Result.FAIL.values();//to get all constants(Calling  intertnal methods of Result class)
            System.out.println(arr);
            for(Result r:arr){
                System.out.println(r.ordinal()+":"+r.name());//ordinal gives index of constants
            }
        }
    }
