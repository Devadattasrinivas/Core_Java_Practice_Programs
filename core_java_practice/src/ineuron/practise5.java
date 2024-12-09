package ineuron;

public class practise5 {
    public static void main(String args[]){
      //  int[] a=new int[3];
       // a[0]=21;
        // int[][][] c=new int[3][4][5];
       // int[][] a=new int[3][4];
      //  a[0]=new int[2];
      //  a[1]=new int[1];
       // a[0][1]=23;
        //a[0][2]=89;

        //a[2][3]=34;
       // a[0][3]=90;error not shown at comple time bcoz its not syntac error logical error (index out of bounds at run time)
       // System.out.println(a[0][3]);
       //int[][][] a=new int[3][3][4];regular
     // a[0]=new int[3][4];
    //  a[1]=new int[3][4];
     // a[2]=new int[3][4];
      //a[0][1][2]=78;
     // System.out.println(a[0][1][2]);
      //  System.out.println(a[0][2][2]);
int[][][] a=new int[2][][];//jagged array[]
        a[0]=new int[2][];
        a[1]=new int[3][];
        a[0][0]=new int[3];
        a[0][1]=new int[4];
a[0][0][2]=78;
        System.out.println(a[0][0][2]);
        int[][][] p=new int[][][] {{{2,3,4}},{{3,3,1}},{{4,2,3}}};
        int[][] o={{3,4},{4,3}};




    }
}
