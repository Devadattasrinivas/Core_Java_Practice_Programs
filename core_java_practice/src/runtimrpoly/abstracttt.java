package runtimrpoly;
abstract class loan{
   // abstract final public void dis();if final then we cant override then how to implement
    abstract  public void dis();
    public void welcome(){
        System.out.println("welcdude");
    }

   /* abstract loan(){//no abstract constr beoc it contain super() body

    }
    */
}
class cargoloan extends loan{
    public void dis(){
        System.out.println("welcome cargoloan");
    }
}
class passengerloan extends loan{
    public void dis(){
        System.out.println("welcome passloan");
    }
}
public class abstracttt {
    public static void main(String args[]){
      //loan p1=new loan();cant instanstiate  abstract class
        loan p=new cargoloan();//creating ref of abstract class
        p.dis();
        p.welcome();

        loan p1=new passengerloan();
        p1.dis();
        p1.welcome();
    }
}