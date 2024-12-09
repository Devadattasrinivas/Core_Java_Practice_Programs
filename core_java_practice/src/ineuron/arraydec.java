package ineuron;

public class arraydec {
    public static void main(String args[]){
        int[] a=new int[] {3,2,4};
        int[][] b=new int[][]{{2,5},{3,2}};
        int[] x={2,6,7};
        int[][]  y={{3,5,7},{2,7,8}};
       // int[][][] z={{3,2,2},{2,6,7}};
        int[][][]  p=new int[][][]{{{2,3,4},{3,7,8}},{{3,4}}};
        for(int ele:a){
            System.out.println(ele);

        }
    }
}
