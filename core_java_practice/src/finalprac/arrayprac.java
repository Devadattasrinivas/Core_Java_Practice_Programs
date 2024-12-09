package finalprac;
import java.util.Arrays;
public class arrayprac {
    public static void main(String args[]) {
        int[] a = new int[4];
        a[0] = 21;
        a[1] = 45;
        a[2] = 90;
        a[3] = 33;
        System.out.println("1d dec,initi and assignment");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("1d literals");
        int[] c = {23, 56, 78};//direct literals we shouldnt mention size here in direct literals assignment
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("1d literals by using new");
        int[] o = new int[]{3, 6, 7};
        for (int i = 0; i < o.length; i++) {
            System.out.print(o[i] + " ");
        }


        //2d array
        int[][] b = new int[2][3];//[rows][colms]
        b[0][0] = 12;
        b[0][1] = 23;
        b[0][2] = 45;
        b[1][0] = 67;
        b[1][1] = 89;
        b[1][2] = 99;
        System.out.println();
        System.out.println();
        System.out.println("2d reg array ");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("2d jagged array");
        int[][] e = new int[2][];
        e[0] = new int[2];
        e[1] = new int[5];
        //e[2]=new int[5];
        int value = 1;
        for (int i = 0; i < e.length; i++) {
            for (int j = 0; j < e[i].length; j++) {
                e[i][j] = value;
                System.out.print(e[i][j] + " ");
                value++;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("again overwriting no.of rows in nxt line after initilia..");
        int[][] f = new int[2][];//or int[][] f;f=new int[1][];
        f = new int[1][];
        f[0] = new int[2];
        int val = 1;
        for (int i = 0; i < f.length; i++) {
            for (int j = 0; j < f[i].length; j++) {
                f[i][j] = val;
                System.out.print(f[i][j] + " ");
                val++;
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("2d direct literals jagged array");
        int[][] g = new int[][]{{3, 4}, {6, 7, 8}};//or int[][] g= {{3,4},{6,7,8}}; (for direct literals we have to initilaize the data in the same line not in the nxt line after decl..
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < g[i].length; j++) {
                System.out.print(g[i][j] + " ");

            }
            System.out.println();
        }

       /* int[][] g=new int[][];
        g={{3,4},{6,7,8}};
        not allowed like this
        */


        System.out.println();
        System.out.println("3d reg array");
        int[][][] l = new int[2][1][3];//[no. of 2d arrays[2(0,1)][rows][colms]
        int v = 1;
        System.out.println(l.length);
        for (int i = 0; i < l.length; i++) {
            for (int j = 0; j < l[i].length; j++) {
                for (int k = 0; k < l[i][j].length; k++) {
                    l[i][j][k] = v;
                    System.out.print(l[i][j][k] + " ");
                    v++;
                }
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("3d jagged array");
        int[][][] r;
        r = new int[2][][];//2d arrays 2
        r[0] = new int[3][3];//2d array 1 with 3 rows(already mentioned colns with rows if we have to change colns then we have to mention like below
        r[1] = new int[2][];//2d array 2 with 2 rows
      /*  r[0][0]=new int[3];//2d array 1 row with 3 colns
        r[0][1]=new int[2];//2d array 1 row with 3 colns
        r[0][2]=new int[3];//2d array 1 row with 3 colns

       */
        r[1][0] = new int[5];//2d array 2 row with 5 colns
        r[1][1] = new int[2];//2d array 2 row with 2 colns
        int va = 3;
        System.out.println(r.length);
        for (int i = 0; i < r.length; i++) {//2
            for (int j = 0; j < r[i].length; j++) {//3rows,2rows
                //  System.out.println("row length"+" "+r[i].length);
                for (int k = 0; k < r[i][j].length; k++) {//3cols,2cols
                    r[i][j][k] = va;
                    System.out.print(r[i][j][k] + " ");
                    va++;
                }
                System.out.println();
            }
        }

        System.out.println();
        System.out.println("3d jagged array with direct literals");
        int[][][] n = {{{1, 2}, {5, 6, 7}}, {{2, 3, 4, 5}, {3, 1}}, {{1, 2, 3}, {4, 5}}};
        for (int i = 0; i < n.length; i++) {//2
            for (int j = 0; j < n[i].length; j++) {//3rows,2rows
                for (int k = 0; k < n[i][j].length; k++) {//3cols,2cols
                    System.out.print(n[i][j][k] + " ");
                }
                System.out.println();
            }
        }
        //declaring 2dim arrrays 2 arrays at a time
        int[][] er, re;
        re = new int[][]{{23, 32}, {34, 56}};
        re = new int[][]{{3, 4}, {6, 9}};

        int[][] yu, yi;
        yu = new int[][]{{56, 5}, {7, 8}};
        yi = new int[][]{{45, 67, 78}};

        //array methods
        System.out.println("array method fill ");
        int[] x = {3, 2, 6, 7};
        Arrays.fill(x, 1, 3, 56);

        for (int ele : x) {
            System.out.println(ele);
        }
        int[] z={2,12,10,34};
        Arrays.fill(z,0,3,34);//from ind to end-1
        for(int ele:z){
            System.out.print(ele+" ");
        }

            System.out.println();

       int[] s=new int[4];
        Arrays.fill(s,34);
        for(int ele:s){
            System.out.print(ele+" ");
        }
    }
}
