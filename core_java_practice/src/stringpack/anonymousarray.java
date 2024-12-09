package stringpack;

public class anonymousarray {
    public static void main(String args[]){
        display(new int[]{21,34,56});//static method so calling with classname

    }
    static void display(int[] a){
        for(int ele:a){
            System.out.print(ele+" ");
        }
    }
}
