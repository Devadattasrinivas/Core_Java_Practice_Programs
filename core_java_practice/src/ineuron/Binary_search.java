package ineuron;
import java.util.*;
public class Binary_search {
    public static void main(String args[]){
        int[] a={3,4,5,6,7,8};
        Scanner s=new Scanner(System.in);
        System.out.println("enter key");
        int key=s.nextInt();
        int low=0;
        int high=a.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(key==a[mid]) {
                System.out.println("key found at index"+mid);
                break;
            }else if(key>a[mid]){
                low=mid+1;
            }else if(key<a[mid]){
                high=mid-1;
            }
        }
        if(low>high){
            System.out.println("key not found index");
        }
    }
}
