package runtimrpoly;
class plane{
    public void takeoff(){
        System.out.println("plane takeoff");
     }
    public void fly(){
        System.out.println("plane fly");
    }
    public void landing(){
        System.out.println("plane landing");
    }
}
class cargoplane extends plane{
    public void fly(){
        System.out.println("cargoplane fly");
    }
}
class passengerplane extends plane{
    public void fly(){
        System.out.println("passengerplane fly");
    }
}
class commonclass{
    public void permit(plane pp){
        pp.fly();
        pp.takeoff();
        pp.landing();
    }
}
public class creatsepclass {
    public static void main(String args[]){
     cargoplane c=new cargoplane();
     passengerplane p=new passengerplane();
     commonclass  cm=new commonclass();
     cm.permit(c);
     cm.permit(p);
     /*
     c.fly();
     c.takeoff();
     c.landing();
     System.out.println();

     p.fly();
     p.takeoff();
     p.landing();
     System.out.println();

      */

/*
     plane pp;
     pp=c;
        pp.fly();
        pp.takeoff();
        pp.landing();
     System.out.println();

     pp=p;
        pp.fly();
        pp.takeoff();
        pp.landing();

 */


    }
}
