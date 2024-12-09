package ineuron;

public class abcpattern {
    public static void main(String args[]) {
        int n = 10;
        int i;
        //a
        for (i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                if ((i==0 && j>0 && j<=(n - 1)/2) || (j == 0 && i > 0) ||( i==0 && j>=(n-1)/2  && j<(3*n)/4)|| (j==(3*n)/4 && i>0) ||  (i==(n-1)/2  && j<=(3*n)/4) )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
           //b
            for (int j = 0; j <= (n - 1); j++) {
                if ((j == 0) || (i == 0 && j < (n - 1) / 2) || (i == (n - 1) / 2 && j < (n - 1) / 2) || (i == (n - 1) && j < (n - 1) / 2) || (j == (n - 1) / 2 && i > 0 && i != (n - 1) / 2 && i != (n - 1)))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

             //c
            for (int j = 0; j <= (n - 1); j++) {
                if ((j == 0 && i > 0 && i!=(n-1)) || (i == 0 && j > 0 && j <= (n - 1) / 2) ||  (i == 0  && j>= (n-1)/2 && j <= (3 * n) / 4) || (i==(n-1) && j>0 &&j<(n-1)/2) ||(i==(n-1) && j>=(n-1)/2 && j<=(3*n)/4))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
        }
    }


