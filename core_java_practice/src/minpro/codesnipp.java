package minpro;

public class codesnipp {
    public static void main(String args[]){
       // if(args.length==1 | args[1].equals("test")){
       //     System.out.println("test case");
       // }else{
        //    System.out.println("production"+args[0]);
        //}
        int x;
        if(args.length>0){
            x=10;
        }else {
           x=20;
        }
        System.out.println(x);
        System.out.println(args.length);
    }
}
