package ineuron;
//creating array for customized class
class goat{
    int n;
    String name;
    float f;
}
public class practise61 {
    public static void main(String args[]) {
        //enhanced loop
        int[] i = new int[]{4, 2, 3};
        int[][] t = new int[][]{{2, 3}, {6, 7}};
        // for(int ele:i){
        //   System.out.println(ele);
        // }
        for (int[] a : t) {
            for (int elem : a) {
                System.out.println(elem);
            }
        }
    }
}
