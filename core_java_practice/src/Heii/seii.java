package Heii;

public class seii {

        public static void main(String args[]){
            select f1=new select(4,6);
           // f1.print();
            select f2=new select(4,8);
            //f2.print();

            //  f1.increment();

          //  f1.add(f2);//(changes the first fraction)non-static func
           // f1.print();
            select f3=select.add(f1,f2);// (select f3) creating the  function f3 of class select
                                       // select.add(f1+f2) gives new fraction... add is static so classname.funct
             f3.print();

        }
    }




