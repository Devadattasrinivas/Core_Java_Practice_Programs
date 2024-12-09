package ineuron;

class insm{
    //int a=10;
    //int b=8;
    //void add(){
    // int res=a+b;
     //System.out.println(res);
    //void add(int a,int b){
      //  int res=a+b;
      //  System.out.println(res);

    //}
    int add(int a,int b){
        int res=a+b;
        return res;
    }
    }


public class InsMet {
    public static void main(String args[]){
        insm i=new insm();
       // i.add();
        //i.add(3,4);
       int res= i.add(5,7);
        System.out.println(res);

    }
}
