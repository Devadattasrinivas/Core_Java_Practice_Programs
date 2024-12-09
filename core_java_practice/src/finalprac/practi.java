package finalprac;
//methods
public class practi {
    void fun() {
        int a = 10;
        System.out.println(a);
    }

    void funct(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    int func() {
        int a = 10;
        int b = 90;
        int res = a + b;
        //System.out.println(res);
        return res;
    }

    int functi(int a, int b) {
        int c = a + b;
        return c;
    }

    float functi(float a, int b) {
        float c = a + b;
        return c;
    }


    public static void main(String args[]){
        practi p=new practi();
        p.fun();
        p.funct(80,56);
        int res=p.func();
        System.out.println(res);
        int c= p.functi(67,78);
        System.out.println(c);
        float d= p.functi(23.5f,5);
        System.out.println(d);

}
}


