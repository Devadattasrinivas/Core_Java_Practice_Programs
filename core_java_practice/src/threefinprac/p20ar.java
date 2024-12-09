package threefinprac;
import java.util.Arrays;
import java.util.*;
public class p20ar {
    public static void main(String args[]){
        /*
        int[] a=new int[12];//declaration and instantiation
        a[0]=12;//initialization
        int[] b={12,13};//declaration,instantiation and initialization
        int[] c;//declaration
        c=new int[3];//and instantiation
        char d={'3','r'};
         */
       /* int[] a=new int[]{1,2,3};
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        */

        //2d
        /*
        int[][] a=new int[][]{{1,2},{5,7}};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

         */
/*
        int[][] a=new int[2][3];
        a[0][0]=21;
        a[0][1]=29;
        a[1][0]=32;
        a[1][1]=37;
        a[1][2]=9;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
        }
 */
/*
        int[][] b=new int[2][];
        b[0]=new int[3];
        b[1]=new int[2];
        b[0][0]=13;
        b[0][1]=45;
        b[0][2]=67;
        b[1][0]=89;
        b[1][1]=90;

        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                System.out.print(b[i][j]+" ");
            }
                System.out.print(b[i][j]+" ");
        }

 */
        /*
        int[][] c={
                {1,2},
                {4,5,6}
        };
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[i].length;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();

        }
         */
        //3d jagged
        /*
        int[][][] a=new int[2][][];
         a[0]=new int[3][];
         a[1]=new int[2][];
         a[0][0]=new int[1];
         a[0][1]=new int[2];
         a[0][2]=new int[3];
         a[1][0]=new int[1];
         a[1][1]=new int[2];
         a[0][0][0]=1;
         a[0][1][0]=2;
         a[0][1][1]=3;
         a[0][2][0]=4;
         a[0][2][1]=5;
         a[0][2][2]=6;
         a[1][0][0]=9;
         a[1][1][0]=8;
         a[1][1][1]=7;
         for(int i=0;i<a.length;i++){
             for(int j=0;j<a[i].length;j++){
                 for(int k=0;k<a[i][j].length;k++){
                     System.out.print(a[i][j][k]+" ");
                 }
                 System.out.println();

             }
         }
         */
/*
        int[][][] a={
                {
                    {1,2},
                    {4,5,6}
                },
                {
                    {7,8,9},
                    {2,4}
                }

                   };
         for(int i=0;i<a.length;i++){
             for(int j=0;j<a[i].length;j++){
                 for(int k=0;k<a[i][j].length;k++){
                     System.out.print(a[i][j][k]+" ");
                 }
                 System.out.println();
             }

         }
 */
        /*
     int[][] we,er;
     we=new int[][]{{2,3},{6,8}};
     er=new int[][]{{2,6},{9,8,7}};
         */

/*
        int[] x={4,3,1};
        //Arrays.fill(x,0,2,56);
        Arrays.fill(x,45);
        for(int i=0;i<x.length;i++){
            System.out.print(x[i]+" ");
        }
 */
        //sum of array
/*
        int[] a=new int[]{5,4,3};
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println(sum);

 */
        /*
        Scanner s=new Scanner(System.in);
        int[] a=new int[4];
        System.out.println("enter array");
        for(int i=0;i<a.length;i++){
          a[i]=s.nextInt();
        }
        for(int i=0;i<a.length;i++){
         System.out.println(a[i]+" ");
        }
         */


    }
}
