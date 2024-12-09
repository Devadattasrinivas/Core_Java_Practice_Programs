package threefinprac;
/*
class enca{
    private int a;
    private int b;

    public void setA(int a){
     this.a=a;
    }
    public int getA(){
    return a;
    }

    public void setB(int b){
        this.b=b;
    }
    public int getB(){
        return b;
    }
}
public class p8 {
    public static void main(String args[]){
    enca c=new enca();
    c.setA(4);
    int d=c.getA();
    System.out.println(d);
    c.setB(1);
    int e=c.getB();
    System.out.println(e);
    }
}
 */

/*
class enc{
    private int rollno;
    private String name;
    private String city;
    public void setRollno(int r){
        rollno=r;
    }
    public int getRollno(){
        return rollno;
    }
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public void setCity(String c){
      city=c;
    }
    public String getCity(){
        return city;
    }
}
public class p8 {
    public static void main(String args[]) {
        enc e=new enc();
        e.setRollno(1);
        e.setName("fawer");
        e.setCity("qutub");
      int y= e.getRollno();
      String n=e.getName();
      String u=e.getCity();
        System.out.println(y);
        System.out.println(n);
        System.out.println(u);
    }
    }

 */
//shadowing
class enc{
private int rollno;
private String name;
private String city;
public void setRollno(int rollno){
        rollno=rollno;
        }
public int getRollno(){
        return rollno;
        }
public void setName(String n){
        name=name;
        }
public String getName(){
        return name;
        }
public void setCity(String city){
        city=city;
        }
public String getCity(){
        return city;
        }
}
public class p8 {
    public static void main(String args[]) {
        enc e=new enc();
        e.setRollno(1);
        e.setName("fawer");
        e.setCity("qutub");
        int y= e.getRollno();
        String n=e.getName();
        String u=e.getCity();
        System.out.println(y);
        System.out.println(n);
        System.out.println(u);
    }
    }