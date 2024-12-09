package ineuron;
import java.util.*;
public class arrayMethod {
    public static void main(String args[]){
        int a[]=new int[5];
        for(int ele:a){
            System.out.print(ele+" ");
        }
      Arrays.fill(a,12);
        System.out.println();
        for(int ele:a){
            System.out.print(ele+" ");
        }
    }
}