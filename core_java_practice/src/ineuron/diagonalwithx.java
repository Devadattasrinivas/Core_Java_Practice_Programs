package ineuron;

public class diagonalwithx {
    public static void main(String args[]){
        int n=27;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i+j==(n-1)/2) || (i-j==(n-1)/2) || (j-i==(n-1)/2) || i+j==((n-1)+((n-1)/2)) || (i+j ==(n-1)) || (i==j) ||i==0  ||j==0 || j==(n-1) || (i==(n-1)))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
