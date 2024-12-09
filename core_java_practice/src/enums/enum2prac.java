package enums;
import java.util.*;
enum Day{
    SUNDAY,MONDAY,TUESDAY;
    private int id;
    Day(){
        System.out.println("era");
    }
    public void setid(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void dis(){
        System.out.println(id+" displayed");
    }
}
public class enum2prac {
    public static void main(String args[]){
        Day d=Day.MONDAY;
       // d.dis();
        d.setid(2);
        d.dis();
        int i=d.getId();
        d.dis();

    }
}
