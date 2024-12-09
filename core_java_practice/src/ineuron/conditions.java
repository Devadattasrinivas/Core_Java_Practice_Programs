package ineuron;

public class conditions {
    public static void main(String args[]){
        int a=1;
        int b=5;
        int c=7;
        if(a<b){
            if(a<c){
                System.out.println("a is least "+a);
            }else{
                System.out.println("c is least "+c);
            }
        }else if(b<c){
            System.out.println("b is least "+b);
        }else{
            System.out.println("c is least "+c);
        }

    }
}
