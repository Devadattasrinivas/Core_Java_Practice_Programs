package fractionoutside;
import fraction.factioninc;
public class fractionde {
    public static void main(String args[]){
        factioninc f=new factioninc(4,6);
        factioninc f2=new factioninc(4,8);
        //f.add(f2);
      //  f.print();
      //  f.increment();
        //f.print();
        factioninc f3=factioninc.add(f,f2);//static function so calling using class name
        f3.print();
    }
}
