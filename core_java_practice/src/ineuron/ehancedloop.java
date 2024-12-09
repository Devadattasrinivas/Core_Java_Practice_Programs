package ineuron;

public class ehancedloop {
    public static void main(String args[]){
        int[] a=new int[] {10,20,30,40};
        int[][] b=new int[][]{{30,40},{1,2,3}};
        for(int ar[]:b){
            for(int ele:ar){//take row at each iteration
                System.out.print(ele+" ");//take values from the row
            }
        }
        System.out.println();

        for(int ele:a){
            System.out.print(ele+" ");
        }
    }
}
