package inheritance;
class one{
String name;
int n;
    void disp(){
        System.out.println(name+" "+n);
    }
}
class two extends one{
    String fname;
    String gname;
    //
    {
        name = "float";
        n=6;
    }

    void displ(){
        System.out.println(fname+" "+gname);
    }
}
public class singleinh {
    public static void main(String args[]){
    two t=new two();
    t.fname="devadatta";
    t.gname="khairunnisa";
    t.disp();
    t.displ();
    }
}
