package fractioncreate;

public class FractioUse {
    public static void main(String args[]){
        Fraction f1=new Fraction(4,6);
        Fraction f2=new Fraction(4,8);
        f1.print();
       // f1.add(f2);//f2 passed as arg
        //f1.print();
       Fraction f3= Fraction.add(f1,f2);
       f3.print();

    }
}
