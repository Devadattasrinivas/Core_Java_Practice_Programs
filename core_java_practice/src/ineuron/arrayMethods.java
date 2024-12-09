package ineuron;
import java.util.*;
public class arrayMethods {
    public static void main(String args[]){
        int[] a=new int[4];
        for(int ele:a){
            System.out.print(ele);
        }
        Arrays.fill(a,5);
        System.out.println();
        for(int ele:a){
            System.out.print(ele);
        }
        int b[]={4,5,6};
    }
}
