package ineuron;
import java.util.*;
public class jaggedtwodim {
    public static void main(String args[]){
        int[][] a=new int[3][];
       a[0]=new int[4];
       a[1]=new int[3];
       a[2]=new int[2];
        Scanner s=new Scanner(System.in);
        System.out.println("before reading");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.println("class"+i+" "+"student"+j);
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("printing elem");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.println("class"+i+"student"+j+ " "+a[i][j]);
            }
        }

    }
}
