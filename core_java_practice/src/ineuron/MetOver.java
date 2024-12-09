package ineuron;
class met{
    int add(int a,int b){
        return a+b;
    }
    float add(float a,int b){
        return a+b;
    }
    double add(int a,double b,float c){
        return a+b+c;
    }
    float add(int a,float b){
        return a+b;
    }

}
public class MetOver {
    public static void main(String args[]){
        met u=new met();
        int a=3,b=5,c=8;
        double m=9.4,n=5;
        float x=3.07f,y=4.2f;
        System.out.println(u.add(a,b));
        System.out.println(u.add(x,a));
        System.out.println(u.add(a,m,x));

    }
}
