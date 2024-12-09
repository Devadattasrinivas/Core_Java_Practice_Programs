package ineuron;

public class minmaxarray {
    public static void main(String args[]) {
        int[] a=new int[] {20,33,45,66,2};
        int max=a[0];
        int min=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println(min);
        System.out.println(max);

    }
    }

