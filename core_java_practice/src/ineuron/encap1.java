package ineuron;


class Hello{
    private int age;
    private String name;
    private String city;
    public void setAge(int age){
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setCity(String city)
    {
        this.city=city;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String getCity(){
        return city;
    }
}
public class encap1 {
    public static void main(String args[]){
        Hello h=new Hello();
        h.setAge(21);
        h.setName("dev");
        h.setCity("Andhra");
        System.out.println(h.getName());
        System.out.println(h.getAge());
        System.out.println(h.getCity());
       // Hello h1=new Hello();

    }
}

