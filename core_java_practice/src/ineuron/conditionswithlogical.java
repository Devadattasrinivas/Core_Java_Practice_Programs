package ineuron;

public class conditionswithlogical{
    public static void main(String args[]){
        int a=10;
        int b=23;
        int c=3;
        if(a<b && a<c){
            System.out.println("a is least");
        }else if(b<c){
            System.out.println("b is least");
        }else{
            System.out.println("c is least");
        }
    }
}
