package ineuron;
/*
class Student{
   private int age;
   private int rollno;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;


   void setRollno(int r){
       rollno=r;
   }
   int getRollno(){
       return rollno;
   }
   void setName(String n){
       name=n;
   }
    String getName(){
        return name;
    }

}

public class encapsulation {
    public static void main(String args[]){
        Student s=new Student();
       // s.age;
        s.setAge(5);
        int age=s.getAge();
        System.out.println(age);
        s.setRollno(6);
        int rollno=s.getRollno();
        System.out.println(rollno);
        s.setName("prabha");
        System.out.println(s.getName());

    }
}




/*
 //shadowing (name conflict between instance var and local by jvm using this keyword )
class Student{
   private int age;
    private int rollno;
    private String name;

    void setAge(int age){//local var
        age=age;//inst var=local var
    }
    int getAge(){
        return age;
    }
    void setRollno(int rollno){
        rollno=rollno;
    }
    int getRollno(){
        return rollno;
    }
    void setName(String name){
        name=name;
    }
    String getName(){
        return name;
    }

}

public class encapsulation {
    public static void main(String args[]){
        Student s=new Student();
        // s.age;
        s.setAge(5);
        int age=s.getAge();
        System.out.println(age);//0
        s.setRollno(6);
        int rollno=s.getRollno();
        System.out.println(rollno);//0
        s.setName("prabha");//null(bcoz)jvm dont know inst and local var diffe)
        System.out.println(s.getName());

    }
}
*/
//to avoid use this
class Student{
    private int age;
    private int rollno;
    private String name;

    void setAge(int age){//local var
       this.age=age;//inst var=local var
    }
    int getAge(){
        return age;
    }
    void setRollno(int rollno){
        this.rollno=rollno;
    }
    int getRollno(){
        return rollno;
    }
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }

}

public class encapsulation {
    public static void main(String args[]){
        Student s=new Student();
        s.setAge(5);
        int age=s.getAge();
        System.out.println(age);
        s.setRollno(6);
        int rollno=s.getRollno();
        System.out.println(rollno);
        s.setName("prabha");
        System.out.println(s.getName());

    }
}