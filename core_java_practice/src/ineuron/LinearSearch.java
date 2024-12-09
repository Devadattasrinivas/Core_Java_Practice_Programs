package ineuron;
import java.util.*;
public class LinearSearch {
    public static  void main(String args[]){
        int[] a={10,20,30,60,21,11};
        Scanner s=new Scanner(System.in);
        System.out.println("enter key");
        int key=s.nextInt();
        boolean flag=false;
        for(int i=0;i<a.length;i++) {
            if (key == a[i]) {
                flag = true;
                System.out.println("key" + " " + key + " element found at index " + i);
                break;
            }
        }
            if(flag==false){
                System.out.println("key not found "+key);
            }


    }
}
