package ineuron;

public class BubbleS {
    public static void main(String args[]) {
        int[] b = {4, 2, 3, 8, 34, 12};
        for (int i = 0; i < b.length; i++) {
            for (int j = 1; j < b.length - i; j++) {
                if (b[j] < b[j - 1]) {
                    int temp = b[j];
                    b[j] = b[j - 1];
                    b[j - 1] = temp;
                }
            }
        }
        for (int ele : b) {
            System.out.println(ele);

        }
    }
}
