package finalprac;
//method overloading
public class practis {

    void  kanaka(){
        int a=20;
        int b=70;
        int c=a+b;
        System.out.println(c);
    }
    float kanaka(int a,float b){
        float c=a+b;
        return c;
    }
    float kanaka(float a,int b){
        float c=a+b;
        return c;
    }
    float kanaka(float a,float b,int g){
        float c=a+b+g;
        return c;
    }
    int kanaka(int a,int b){
        int c=a+b;
        return c;
    }
    boolean kanaka(boolean a,boolean b){
        if(a==b)
            return true;
        else
            return false;
    }
    double kanaka(int a,double b,float c){
        double d=a+b+c;
        return d;
    }
    public static void main(String args[]){
       practis p=new practis();
        //method call by passing values as direct literals  in main method
        System.out.println(p.kanaka(true,false));//for any return values print using sopln or store it in a var and print
        System.out.println(p.kanaka(true,true));
        System.out.println(p.kanaka(3,4.5,3));//int coverted to float
        System.out.println(p.kanaka(3,4.8,5.8f));
        System.out.println(p.kanaka(4,5));
        System.out.println(p.kanaka(3.4f,4.5f,3));
        System.out.println(p.kanaka(3.6f,4));
        System.out.println(p.kanaka(3,7.3f));
        p.kanaka();//for void return type we  shouldnt use print method bcoz void type it returns nothing to print
        //passing the values by using parameters
        int a=8,b=4,c=90;
        double x=4.5,y=4.3;
        float f=3.4f,g=4.1f;
        boolean s=true,e=false;
        System.out.println(p.kanaka(s,s));
        System.out.println(p.kanaka(a,c));
        System.out.println(p.kanaka(c,f));
        System.out.println(p.kanaka(f,a));
        System.out.println(p.kanaka(b,y,g));
        System.out.println(p.kanaka(b,f,g));



    }
}

