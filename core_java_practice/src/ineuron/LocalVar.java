package ineuron;

public class LocalVar {
    public static void main(String args[]){
        int a=10;//local var declared in a method stored in stack area
        int b=20;
        int c=a+b;
        System.out.println(c);
        for(int i=0;i<5;i++){//i local var created in block destroyed once block closed
            System.out.print(i +" ");
        }
       // System.out.println(i);(cant  access local var i whose scpe omly in the for loop block
    }
}
