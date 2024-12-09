package threefinprac;
//runtime polymorphimsm: it can be achieved by creating the parent class reference
class plane{
    public void cry(){
        System.out.println("plane cry");
    }
    public void eat(){
        System.out.println("plane eat");
    }
    public void takeoff(){
        System.out.println("plane takeoff");
    }
}
class cargoplane extends plane{
    public void eat(){
        System.out.println("cargoplane  overriding eat");
    }
    public void cry(){
        System.out.println("cargoplane  overriding cry");
    }
    public void spe(){
        System.out.println("cargoplane specialized spe");
    }

}

class passplane extends plane{
    public void cry(){
        System.out.println("passplane  overriding cry");
    }
    public void eat(){
        System.out.println("passplane  overriding eat");

    }
}
class commonclass{
    public void met(plane p){
        p.cry();
        p.eat();
        p.takeoff();
      //  p.spe();
    }
}

public class p18 {
    public static void main(String args[]){
        /*
        cargoplane c=new cargoplane();
        passplane c1=new passplane();
        commonclass w=new commonclass();
        w.met(c);
        w.met(c1);
        ((cargoplane)c).spe();//downcasting

         */

        //tight coupling
/*
        cargoplane c=new cargoplane();
        c.cry();
        c.eat();
        c.takeoff();
        c.spe();

        passplane c1=new passplane();
        c1.cry();
        c1.eat();
        c1.takeoff();

 */


        //loose coupling

        //met:1

        cargoplane c=new cargoplane();
        passplane c1=new passplane();

        plane p;//parent class ref
        p=c;
        p.cry();//1:m
        p.eat();
        p.takeoff();
        ((cargoplane)c).spe();

         p=c1;
        p.cry();//1:m
        p.eat();
        p.takeoff();




        //met:2
/*
        plane c=new cargoplane();
        plane c1=new passplane();
        c.cry();
        c.eat();
        c.takeoff();
        ((cargoplane)c).spe();

        c1.cry();
        c1.eat();
        c1.takeoff();

 */


    }
}
