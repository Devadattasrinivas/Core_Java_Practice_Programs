package inheritance;
//final class cant be inherited
/*
final class  fin{
    int a=10;
}
class fin1 extends fin{

}
public class finaluse{
    public static void main(String args[]){

    }
}

 */
//final method  can be inherited but cant be overriden0
//final method  can be inherited
/*
class fin{
    final void dis(){
        System.out.println("display");
    }
}
class fin1 extends fin{

}
public class finaluse{
    public static void main(String args[]){
  fin f=new fin();
  f.dis();
    }
}

 */

    //final method  cant be inheriteoverriden
/*
class fin{
final void dis(){
        System.out.println("display");
        }
        }
class fin1 extends fin{
    void dis(){
        System.out.println("display");
    }
}

public class finaluse{
    public static void main(String args[]){
        fin f=new fin();
        f.dis();
    }
}

 */
//final var  value cant be changed
/*
class fin{
    final int  a=10;
        final void dis(){
            a=20;
            System.out.println(a);
        }
    }
class fin1 extends fin{

}

public class finaluse{
    public static void main(String args[]){
        fin f=new fin();
        f.dis();
    }
}

 */
