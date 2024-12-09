package ineuron;

public class conditionswithequal{
    public static void main(String args[]){
        int a=40;
        int b=80;
        int c=30;
        if(a<b || a==b){//some conditions wrong with || operator
            System.out.println("a is least");
        }else if(b<c || b==c){
            System.out.println("b is least");
        }else if(c<a || c<b){
            System.out.println("c is least");
        }else{
            System.out.println("last block");
        }
    }
}
