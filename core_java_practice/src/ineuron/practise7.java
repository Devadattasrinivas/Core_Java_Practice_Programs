package ineuron;

public class practise7 {
    public static void main(String args[]){
        int[] a[],b[];
        int[] ab,cd;
        ab=new int[5];
      //a[0]=new int[8];
        int[] c=new int[] {3,4,8,1};
        int sum=0;
        int min=c[0];
        int max=c[0];

        for(int i=1;i<c.length;i++){
            if(c[i]<min)
                min=c[i];
            if(c[i]>max)
                max=c[i];
        //    sum=sum+c[i];
       }
 // System.out.println(sum);
        System.out.println(min);
        System.out.println(max);
    }
}
