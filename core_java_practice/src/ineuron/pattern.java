package ineuron;

public class pattern {
    public static void main(String[] args){
        int n=10;
        int t=n-1;
        System.out.println(t);
        for(int i=0;i<=n-1;i++){
            for(int j=0;j<=n-1;j++){
               if( (j==0) || (i==t && j<t/2) || (i==0  && j<t/2)|| (i==t/2 && j<t/2) ||(j==t/2 && (i!=0)&& i!=t/2 && i!=t) )
                   System.out.print("*");
               else
                   System.out.print(" ");

            }
            System.out.println();
        }
    }
}
