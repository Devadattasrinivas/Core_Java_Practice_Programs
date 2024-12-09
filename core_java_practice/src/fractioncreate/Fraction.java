package fractioncreate;
import java.util.*;
public class Fraction{
    private int numer;
    private int denom;
    public Fraction(int numer,int denom){
        this.numer=numer;
        this.denom=denom;
        simplify();
    }
    private void simplify(){//not passing values like in constructor so no need to pass args
        int smallest=Math.min(numer,denom);
       int  gcd=1;
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
    public void add(Fraction f2){
        this.numer=this.numer*f2.denom+this.denom*f2.numer;
        this.denom=this.denom*f2.denom;
        simplify();
    }//f2 type declared as Fraction and it is obj of class Fraction,declaring the type by class name before passing f2
    public static Fraction add(Fraction f1,Fraction f2){//fraction is our custom made  return type just like int,St..
        int newnum=f1.numer*f2.denom+f1.denom*f2.denom;
        int newden=f1.denom*f2.denom;
        Fraction f3=new Fraction(newnum,newden);
        return f3;
    }
}
