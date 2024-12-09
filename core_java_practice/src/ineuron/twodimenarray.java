package ineuron;
import java.util.*;
public class twodimenarray {
    public static void main(String args[]){
        int[][] a=new  int[2][4];
        Scanner s=new Scanner(System.in);
            for(int i=0;i<a.length;i++){;
          for(int j=0;j<a[i].length;j++){
              System.out.println("enter the 2 dim array class"+i+"student" +j);
              a[i][j]=s.nextInt();
          }
      }
        System.out.println("printing");

        for(int i=0;i<a.length;i++){;
                    for(int j=0;j<a[i].length;j++){
                        System.out.println("class"+i+"student"+j+ " "+a[i][j]);
                    }
                }

            }
        }

