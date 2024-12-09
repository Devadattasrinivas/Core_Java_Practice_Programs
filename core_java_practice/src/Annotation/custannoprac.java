package Annotation;
import java.util.*;
import java.lang.annotation.*;
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)//if(.class given values upto class only it gives e null)
@interface era{
    int a();
    int b();
}
@era(a=1,b=2)
class der{
     private String q;
     private String w;

    public void setQ(String q) {
        this.q = q;
    }
    public String getQ() {
        return q;
    }
    public void setW(String w) {
        this.w = w;
    }

    public String getW() {
        return w;
    }
}
public class custannoprac {
    public static void main(String[] args) {
      der r=new der();
      r.setQ("eraqww");
      System.out.println(r.getQ());
      r.setW("paaqwer");
      System.out.println(r.getW());
      Class c=r.getClass();
      Annotation a=c.getAnnotation(era.class);
        era e=(era)a;
        System.out.println(e.a());
        System.out.println(e.b());
    }
}
