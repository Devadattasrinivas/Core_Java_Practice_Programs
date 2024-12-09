package ineuron;
import java.util.*;
public class twoodimarray {
    public static void main(String args[]){
        int[][] a=new int[3][4];
        Scanner s=new Scanner(System.in);
        System.out.println("storing elem:");
                for(int i=0;i<a.length;i++){
                    for(int j=0;j<a[i].length;j++){
                        System.out.println("class"+i+"student"+j);
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
