package ineuron;
import java.util.*;
public class arraywithscanner {
    public static void main(String args[]){
        int[] a=new int[5];
        //char b[]= new char[5];
            Scanner s=new Scanner(System.in);
            System.out.println("enter num");
            for(int i=0;i<5;i++){
                 a[i]=s.nextInt();//to read int value
            }
      //  for(int i=0;i<b.length;i++){
       ////     b[i]=s.next().toCharArray();//to read char value
      //  }
        System.out.println("after read array is");
            for(int i=0;i<5;i++){
                System.out.println(a[i]);
            }
    }
}
