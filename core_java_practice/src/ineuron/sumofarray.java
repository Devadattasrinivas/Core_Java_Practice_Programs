package ineuron;

public class sumofarray {
    public static void main(String args[]){
        int[] a=new int[] {20,33,45};
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
   System.out.println(sum);
    }
}
