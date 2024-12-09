package functinterandstreamapi;
/*
class Samp{
    String s;
    public Samp(String s){
        this.s=s;
        System.out.println("sample constr executed "+s );
    }
}
interface inte{
    public Samp get(String s);
}
public class func7prac {
    public static void main(String[] args) {
        //by lamda ref
      inte in=s->{
          return new Samp(s);//method call by creating obj of samp class  by get() in interface to execute  samp const
      };//lamda exp
     in.get("interface lamda exp");//sending string in s


        //by constr ref
        inte i=Samp::new;//classname::new
        i.get("era");
    }
}
 */
interface am{
    public void m1(String s);
}
public class func7prac {
    public void m2(String s){
        System.out.println("m2 method--"+s);
    }
    public static void main(String[] args) {
       am a= d -> System.out.println(d);//lamda exp
                 a.m1("era in m1");

        am a1=new func7prac()::m2;//binding m2 with m1 method in interface
        a1.m1("binding m2 method with m1 using obj ref");
    }
    }