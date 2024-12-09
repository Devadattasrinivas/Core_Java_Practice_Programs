package ineuron;
import java.util.*;
public class threedim {
    public static void main(String args[]){
        int[][][] a=new int[2][3][3];
        Scanner s=new Scanner(System.in);
      a[0]=new int[3][3];
      a[1]=new int[3][3];
      for(int i=0;i<a.length;i++){
          for(int j=0;j<a[i].length;j++){
              for(int k=0;k<a[i][j].length;k++){
                  System.out.println("class"+i+" "+"college"+j+" "+"student"+k);
                  a[i][j][k]=s.nextInt();
              }
          }
      }
        System.out.println("printing:");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                for(int k=0;k<a[i][j].length;k++){
                    System.out.println("class"+i+" "+"college"+j+" "+"student"+k+" "+a[i][j][k]);
                }
            }
        }
    }
}
