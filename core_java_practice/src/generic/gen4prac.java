package generic;
import java.util.*;
public class gen4prac {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(23);
        al.add(89);
        methodOne(al);

    }
    // public static void methodOne( ){al type and ref al should be passed
    public static void methodOne(ArrayList<Integer> al){
        al.add(34);
        System.out.println(al);
    }
}