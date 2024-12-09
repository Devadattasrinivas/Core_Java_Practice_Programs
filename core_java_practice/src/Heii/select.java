package Heii;
import java.util.*;

public class select {
        private int numer;
        private int denom;
        public select(int numer,int denom){
            this.numer=numer;
            this.denom=denom;
            simplify();
        }
        public void simplify(){
            int gcd=1;
            int smallest=Math.min(numer,denom);
            for(int i=2;i<=smallest;i++){
                if(numer%i==0 && denom%i==0){
                    gcd=i;
                }
            }
            numer=numer/gcd;
            denom=denom/gcd;
        }
        public void print(){
            System.out.println(numer+"/"+denom);
        }
       // public void increment(){
         //   numer=numer+denom;
         //   simplify();
       // }
        public void add(select f2){//non static function so f1.add(f2) which takes only one argument  and
            //   updating the first fraction which is answer so void return type in the case of static function
            //    function f1+f2  creating third fraction for adding
            this.numer=this.numer*f2.denom+this.denom*f2.numer;
            this.denom=this.denom*f2.denom;
            simplify();
        }
        public static select add(select f1,select f2){
            int newnumer=f1.numer*f2.denom+f1.denom*f2.numer;
            int newdenom=f1.denom*f2.denom;
            select f3=new select(newnumer,newdenom);
            return f3;
        }
    }


