package accpracpp;
import accprac.pra;
//default outside package cant access with is-a relship not accessible
/*
import accprac.pri;

public class def extends pri{
    public static void main(String args[]){
        pri p=new pri();
        p.met();
        System.out.println(p.a);
    }
}
 */
//protected:outside the class from  diff package with is-a relship accessible
/*
public class def extends pra{
    public static void main(String args[]) {
        def o=new def();//create child class onj and call with that obj
        o.met();
       System.out.println(o.a);
    }
}
 */
//protected:outside the class from  diff package without is-a not accessible
/*
public class def {
    public static void main(String args[]) {
        def o=new def();//create child class onj and call with that obj
        o.met();
        System.out.println(o.a);
    }
}
 */
//public:outside the class from  diff package without also accessible
public class def {
   public static void main(String args[]){
       pra p=new pra();
       p.met();
       System.out.println(p.a);
   }
}



