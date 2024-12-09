package ineuron;
import java.util.*;
public class arraymet {
    public static void main(String args[]){
        int[] a={3,5,7,9,4};
        int[] b={2,5,0,0,0,23};
        Arrays.fill(b,2,5,45);
        for(int ele:b){
            System.out.print(ele+" ");
        }
        System.out.println();

        System.out.println("after filling");

        for(int ele:b){
            System.out.print(ele+" ");
        }

        for(int ele:a){
            System.out.print(ele+" ");
        }
        System.out.println();
        Arrays.fill(a,45);
        for(int ele:a){
            System.out.print(ele+" ");
        }

    }
}
