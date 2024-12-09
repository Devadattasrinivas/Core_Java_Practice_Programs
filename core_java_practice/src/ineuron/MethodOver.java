package ineuron;
class Heello{
    int add(int a,int b){
       return a+b;
    }
    float add(int a,float b){
       return a+b;
    }
   // int add(int a,int b){
    //    return a+b;
    //}(return type diff as it no matter but paramters same so error)
    float add(int a,float b,float c){
        return a+b+c;
    }
    float add(float a,int b){//loss of precision in (method overloading with numeric precision)so void type not allowed return type should be mentioned as the  parameters one float and one int which do implicit type casting and results in float value
        return a+b;
    }
}
public class MethodOver{
    public static void main(String args[]){
        Heello h=new Heello();
     int a=4,b=5;
     float m=34.6f,n=5.7f,o=4.2f;
        System.out.println(h.add(a,b));
        System.out.println(h.add(a,n));
        System.out.println(h.add(3.5f,4));
        System.out.println(h.add(10,4.5f));
        System.out.println(h.add(3,9));

    }
}
