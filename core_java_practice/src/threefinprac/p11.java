package threefinprac;
class constrchaining{
    private int rno;
    private int fno;
    private String name;
    private String city;
    public constrchaining(){
        rno=12;
        fno=67;
        name="fae";
        city="goar";
    }
    public constrchaining(String name){
        this.name=name;
        System.out.println(name);
    }
    public constrchaining(int fno){
        this("bala");
        System.out.println(fno);
    }
    public constrchaining(int rno,int fno){//23,56
     this(12);
     this.rno=rno;
     this.fno=fno;

     System.out.println("constr chaining "+rno+" "+fno);
    }
    public int getRno(){
       return rno;
    }
    public int getFno(){
        return fno;
    }
    public String getName(){
        return name;
    }
    public String getCity(){
        return city;
    }
}
public class p11 {
    public static void main(String args[]){
    constrchaining c=new constrchaining(23,56);
    System.out.println(c.getRno());
    System.out.println(c.getFno());
    System.out.println(c.getName());
    System.out.println(c.getCity());

    constrchaining c1=new constrchaining();
    System.out.println(c1.getRno());
    System.out.println(c1.getFno());
    System.out.println(c1.getName());
    System.out.println(c1.getCity());

    }
}
