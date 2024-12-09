package finalprac;

public class array {
    public static void main(String args[]) {
        // int[] a=new int[20];
       int[] b=new int[20];
       double[] c=new double[24];
       double[] num={4.5,6.7,3,4};
       /*
       double[] d;
       d={5.6,4.6,2.4};

        */


        int[] ar = new int[3];
        ar[0] = 34;
        ar[1] = 23;
        ar[2] = 56;
        // int[] b;
        // b={2,6,9};
        int[] y = {5, 6, 2};

        char[] ch = {'g', 'h', 'f'};

        //2d
        int[][] f={{67,90,89},{56,86,55}};
        int[][] a = new int[2][3];
        a[0][0] = 67;
        a[0][1] = 90;
        a[0][2] = 89;
        //a[0][3] = 78;
        a[1][0] = 56;
        a[1][1] = 86;
        a[1][2] = 55;
        System.out.println(a.length);

        //for(int i=0;i<a.length-1;i++){//for 2 dim array a.length gives length(no of rows)of 2 dim array  use rows and columns
        for (int i = 0; i <2 ; i++) {
            for (int j= 0; j <3 ; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        //or
        for (int i = 0; i <a.length; i++) {
            for (int j= 0; j <a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();

        //2d jagged array
        System.out.println("2d jagged array with direct literals");
        int[][] s={{1,4},{5,7,8}};
        for (int i = 0; i <s.length; i++) {
            for (int j= 0; j <s[i].length; j++) {
                System.out.print(s[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("2d jagged array ");
        int[][] q=new int[3][];
        int value=1;
        q[0]=new int[3];
        q[1]=new int[2];
        q[2]=new int[2];

        for(int i=0;i<q.length;i++){
            for(int j=0;j<q[i].length;j++){
                q[i][j]=value;
                value++;
            }
        }

        for(int i=0;i<q.length;i++){
            for(int j=0;j<q[i].length;j++){
                System.out.print(q[i][j]+" ");
            }
            System.out.println();
        }

            //3d
        int[][][] p={{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}}};
        for(int i=0;i<2;i++){//no.of 2 dim arrays
            for(int j=0;j<2;j++){//no of rows
                for(int k=0;k<3;k++){//no of col
                    System.out.print(p[i][j][k]+" ");
                }
                System.out.println();
            }
        }
       int[][][] r=new int[2][3][2];
       r[0][0][0]=21;
       r[0][0][1]=23;
       r[0][1][0]=45;
       r[0][1][1]=78;
       r[0][2][0]=90;
       r[0][2][1]=12;
       r[1][0][0]=67;
       r[1][0][1]=9;
       r[1][1][0]=5;
       r[1][1][1]=8;
       r[1][2][0]=1;
       r[1][2][1]=4;
       for(int i=0;i<2;i++){
           for(int j=0;j<3;j++){
               for(int k=0;k<2;k++){
                   System.out.print(r[i][j][k]+" ");
               }
               System.out.println();
           }
       }

    int[][][] m=new int[2][][];
       m[0]=new int[3][];//1st 2d array with 3 rows
       m[1]=new int[2][];//2nd 2d array with 2 rows
       m[0][0]=new int[3];
       m[0][1]=new int[2];
       m[0][2]=new int[1];
       m[1][0]=new int[3];
       m[1][1]=new int[2];
       int flag=1;
        System.out.println("3dim jagged array");
       System.out.println(m.length);
      for(int i=0;i<m.length;i++){
          for(int j=0;j<m[i].length;j++){
              for(int k=0;k<m[i][j].length;k++){
                  m[i][j][k]=flag;
                  flag++;
              }
              System.out.println();
          }
      }

           //printing the array
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                for(int k=0;k<m[i][j].length;k++){
                    System.out.print(m[i][j][k]+" ");
                }
                System.out.println();
            }
        }

        int[][][] x={{{1,3,5},{7,8}},{{1,3},{6,7,8},{6,5,4}}};
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                for(int k=0;k<x[i][j].length;k++){
                    System.out.print(x[i][j][k]+" ");
                }
                System.out.println();
            }
        }

    }
}

