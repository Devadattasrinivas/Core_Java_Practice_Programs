package ineuron;

public class loops {
    public static void main(String args[]){
        int n=4;
        int b,c,d;
        int a=b=c=d=10;
        System.out.println(a+""+b+""+c+""+d);

        for(int i=0;i<=n-1;i++){
            for(int j=0;j<=n-1;j++) {
               // if (i == 0 || i == n - 1 || j == 0 || j == n - 1 || i==((n-1)/2) ){
               //  if ( j == 0 || j == n - 1 || i==((n-1)/2) ){
                   // if (i == 0 || j == 2 ){
                   //  if (i == 0 || i == n - 1 || j == 0  || i==((n-1)/2) ){
                    // if (i == 0 || j == 0 || j == n - 1 || i==((n-1)/2) ){
               // if(((j==0) && i>0) || ((i==0) && (j>0) && (j<(n-1)/2))|| (i==((n-1)/2)&& (j<=(n-1)/2) )|| (j==((n-1)/2)  &&(i>0)))
              if(((i==0) && (j<n-1)) ||(j==0) || ((i==n-1) && (j<n-1)) ||((j==n-1)&& (i>0) && (i<n-1)))
                System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
