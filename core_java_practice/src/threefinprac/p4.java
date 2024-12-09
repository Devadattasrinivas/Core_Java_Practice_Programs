package threefinprac;
public class p4 {

    void sethod(){
        System.out.println("method overloading void type");
    }
    void setho(int a,float b){
        float c=a+b;
        System.out.println("void meth "+c);
    }
    int setho(){
        int a=10;
        int b=10;
        int c=a+b;
       return c;
    }
    int setho(int a,int b){
        int c=a+b;
       return c;
    }
    float setho(float a,int b){
        float c=a+b;
        return c;
    }
    float setho(int a,float b,float d){
         d=a+b;
        return d;
    }
    double setho(double r,float t){
        double e=r+t;
        return e;
    }
    boolean setho(boolean a,boolean b){
        if(a==b){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
    p4 p=new p4();
    p.sethod();
    p.setho(2,6.7f);//void para
    System.out.println(p.setho());//int
    System.out.println(p.setho(2,5));//imt para
     System.out.println(p.setho(2.5f,6));//float  para
     System.out.println(p.setho(2,6.7f,3.6f));//float  para
     System.out.println(p.setho(3.4,2.1f));
    System.out.println(p.setho(true,true));
    int a=1,b=20,c=10;
    float x=2.3f,y=5.3f,z=1.4f;
    double q=2.33,r=3.11,s=7.4;
        p.setho(2,6.7f);//void para
        System.out.println(p.setho());//int
        System.out.println(p.setho(a,b));//imt para
        System.out.println(p.setho(x,a));//float  para
        System.out.println(p.setho(a,y,z));//float  para
        System.out.println(p.setho(q,z));
        System.out.println(p.setho(true,true));
    }
}
