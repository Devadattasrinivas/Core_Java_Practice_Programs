package ineuron;

public class qpattern {
    public static void main(String args[]) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 1 && j >= n / 4 && j <= (3 * n) / 4 || (i>=n/4 && j==1 && i<(3*n)/4) ||(i>=n/4 && j>(3*n)/4 && j!=(n-1) && i<(3*n)/4) || (i==(3*n)/4 && j>=n/4 && j<=(3*n)/4)||(i>(n-1)/2 && i==j))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
