package ineuron;

public class arraySort {
    public static void main(String args[]){
        int [] arr = new int [] {5, 2, 8, 7, 1};
        int temp=0;
        for(int i=0;i<=arr.length;i++) {
            for (int j = i + 1; j <= arr.length-1; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+"  ");
            }

    }
}
