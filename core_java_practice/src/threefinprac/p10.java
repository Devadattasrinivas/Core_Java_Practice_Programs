package threefinprac;
/*
class constructor{
    private int r;
    private String nam;
    /*
    public void setR(int r){
      this.r=r;
    }
    public void setNam(String nam){
      this.nam=nam;
    }

    //commonsetter is constructor without returntype
    public constructor(int r,String nam){
        this.r=r;
        this.nam=nam;
    }
    public int getR(){
       return r;
    }

    public String getNam(){
        return nam;
    }
}
public class p10 {
    public static void main(String args[]){
        constructor c=new constructor(4,"wer");
        System.out.println(c.getR());
        System.out.println(c.getNam());
    }
}

 */

/*
class constructor{
    private int r;
    private String nam;


    //commonsetter is constructor without returntype
    public constructor(){
       r=10;
       nam="dert";
    }
    public int getR(){
       return r;
    }

    public String getNam(){
        return nam;
    }
}
public class p10 {
    public static void main(String args[]){
        constructor c=new constructor();
        System.out.println(c.getR());
        System.out.println(c.getNam());
    }
}
 */
//constr without default and parametrized includes default const
/*
class  constructor{

}
class p10{
    public static void main(String args[]) {
        constructor q = new constructor();//it executes default constr only when there is no construct
    }
}

 */
//const with prametrized never include default construc
/*
class  constructor{
public constructor(int r){
    System.out.println(r);
}
}
class p10{
    public static void main(String args[]){
        //constructor q=new constructor();//it executes default constr only when there is no construct
        constructor q1=new constructor(2);
    }
}

 */
/*
class constructor{
    public constructor(int r){
        r=10;
        System.out.println(r);
    }

}
public class p10{
    public static void main(String args[]){
        constructor f=new constructor(2);//calls default constructor
        constructor f1=new constructor();//if there is no default const mentioned and  parametrized  called first then jvm wont involve default construc by thinking user knows cost concept it throws error

    }
}

 */