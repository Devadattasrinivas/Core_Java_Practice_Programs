package threefinpracdefa;
import threefinprac.*;
//default outside a package  with is-a relat ,without is-a cant be accessed
/*
public class defaultuse extends accessdefa{
    public static void main(String args[]){
      accessdefa d=new accessdefa();//default so cant access from outside a class

    }
}
 */
/*
public class defaultuse extends p16{
    public static void main(String args[]){
        defaultuse  y=new defaultuse();
        y.met();
    }
}
 */
//protected can be accessed inside and outside a class within same package and can be accesseed outisde the package with is a relship
/*
public class defaultuse extends p16{
    public static void main(String args[]){
        defaultuse  y=new defaultuse();
        y.met();
    }
}
 */
//public cab be accessed anywhere
public class defaultuse extends p16 {
    public static void main(String args[]) {
        defaultuse y = new defaultuse();
        y.mee();
    }
}
