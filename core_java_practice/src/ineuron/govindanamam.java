package ineuron;

public class govindanamam {
    public static void main(String args[]) {
        int n = 11;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
            if((j==n/4 && i<=(3*n)/4) || (j==(3*n)/4 && i<=(3*n)/4)  || (j==(n-1)/2 && i<(3*n)/4) ||(i>(3*n)/4 &&  i!=(n-1) && j>n/4 && j<(3*n)/4) || (i==(n-1) &&j==(n-1)/2))
                System.out.print("*");
            else
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}



