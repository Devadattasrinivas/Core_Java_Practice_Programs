package ineuron;

public class i1pattern {
    public static void main(String args[]) {
        int n = 10;
        // int t = ( (n-1)/2);
        for (int i = 0; i <=(n-1); ++i) {
            for (int j = 0; j <=(n-1); ++j) {
                if (i == 0 || i == (n-1) || j == (n - 1) / 2)
                    System.out.print("*");
                 else
                    System.out.print(" ");

            }
            System.out.println();
        }
    }
}

