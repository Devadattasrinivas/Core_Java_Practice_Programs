package enums;
import java.util.*;
enum Compass{
    NORTH,SOUTH,EAST,WEST;//only constants should be 1st statement
    int i=1;
    /*
    Compass(int i){//enum type can be instiated
        this.i=i;
        System.out.println("compass executed "+i);
        i=i++;
    }
     */
    Compass() {
        System.out.println("compass executed "+i);//for every constant separate class and constructor sochanges cant be seen from one constr to other
       // i=i++;
    }
    public void show(){
        System.out.println("method display");
    }
}
public class enum1prac {
    public static void main(String[] args) {
        //Compass c=new Compass(1);//ce
       // Compass d=Compass.NORTH;//constr called how many values that many times
       // d.show();
       // System.out.println(d);
        Compass f=Compass.valueOf("NORTH");//constr called
        System.out.println(f);


        /*
        Compass[] w=Compass.values();
        for(Compass a:w){
            System.out.println(a.ordinal()+" "+a.name());
        }
         */
    }
}
