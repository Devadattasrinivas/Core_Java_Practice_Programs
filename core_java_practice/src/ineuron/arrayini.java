package ineuron;

public class arrayini {
    public static void main(String args[]) {
        int[] i = new int[3];
        i[0] = 30;
        i[1] = 90;
        i[2] = 78;
        System.out.println(i[0]);
        int[] a1 = new int[]{3, 2, 4};
        int[] a={34,23,1};
        char[] c={'c','f'};
        int[][] a2=new int[][]{{2,3,4},{5,3,2}};
        int[][] a3={{4,3},{4,2}};
        int[][][] a4={{{2,3,4},{3,1,2}},{{4,5},{6,3}}};
        for(int ele:i){
            System.out.println(ele);
        }
    }
}