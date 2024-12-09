package excphandl1;
import java.util.Scanner;
/*
class Invalispasex extends Exception{

}
class custexc{
    int userid=1111;
    int  uid;
    int  password =2222;
    int  pwd;

    Scanner sc=new Scanner(System.in);
    void input() {
        System.out.println("enter uid");
        uid = sc.nextInt();
        System.out.println("enter pwd");
        pwd = sc.nextInt();
    }
    void verify() throws Invalispasex
    {
        if((userid==uid) && (password==pwd)){
            System.out.println("take cash");
        }else{
            Invalispasex i=new Invalispasex();
            System.out.println(i);
            throw i;
        }
    }
}
class bank{
    void wer() {
        custexc c=new custexc();
        try {
            c.input();
            c.verify();
        }catch(Invalispasex e){
            try {
                c.input();
                c.verify();
            }catch(Invalispasex e1){
                try {
                    c.input();
                    c.verify();
                }catch(Invalispasex e2){
                    System.out.println("you have blocked");
                }
            }
        }
    }
}
public class WXCP3 {
    public static void main(String args[]){
          bank k=new bank();
          k.wer();
    }
}
 */
//with cust exception  class  parametrized constructor
/*
class Invalispasex extends Exception{
    public Invalispasex(String m){
        super(m);
    }
}
class custexc{
    int userid=1111;
    int  uid;
    int  password =2222;
    int  pwd;

    Scanner sc=new Scanner(System.in);
    void input() {
        System.out.println("enter uid");
        uid = sc.nextInt();
        System.out.println("enter pwd");
        pwd = sc.nextInt();
    }
    void verify() throws Invalispasex
    {
        if((userid==uid) && (password==pwd)){
            System.out.println("take cash");
        }else{
            Invalispasex i=new Invalispasex("are you sure,password is incorrect");
            System.out.println(i.getMessage());
            throw i;
        }
    }
}
class bank{
    void wer() {
        custexc c=new custexc();
        try {
            c.input();
            c.verify();
        }catch(Invalispasex e){
            try {
                c.input();
                c.verify();
            }catch(Invalispasex e1){
                try {
                    c.input();
                    c.verify();
                }catch(Invalispasex e2){
                    System.out.println("you have blocked");
                }
            }
        }
    }
}
public class WXCP3 {
    public static void main(String args[]){
        bank k=new bank();
        k.wer();
    }
}
 */
//age<18 age>60 not allowed for driving
/*
class InvalidUndAge extends Exception{

}
class InvalidOverAge extends Exception{

}
class license {
    int age;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age");
        int age = sc.nextInt();
    }


    void verify() throws InvalidUndAge,InvalidOverAge{
        if(age<18) {
            InvalidUndAge a=new InvalidUndAge();
            System.out.println(a);
            throw a;
        }
        else if(age>60){
            InvalidOverAge  b=new InvalidOverAge();
            System.out.println(b);
            throw b;
        }
        else {
            System.out.println("eligible");
        }
    }
}
class wer{
    void qe() {
        license l = new license();
        try {
            l.input();
            l.verify();
        }catch(InvalidUndAge e){
            System.out.println("underage");
        }catch(InvalidOverAge e1){
            System.out.println("overage");
        }
    }

}

public class WXCP3 {
    public static void main(String args[]){
     wer r=new wer();
     r.qe();
    }
}
 */
class UndAge extends Exception{
  UndAge(String m) {
        super(m);
    }
}
class OverAge extends Exception{
   OverAge(String m1){
      super(m1);
   }
}
class license{
    int age;
    Scanner sc=new Scanner(System.in);
    void input() {
        System.out.println("enter age");
        age = sc.nextInt();
    }
    void verify() throws UndAge,OverAge{
        if (age < 18) {
            UndAge u=new UndAge("plzz check you are under 18");
            System.out.println(u.getMessage());
            throw u;

        } else if (age > 60) {
            OverAge o=new OverAge("plzz check you are above 60");
            System.out.println(o.getMessage());//to print the passes string which is injected into const is printed from getmsg
            throw o;

        } else {
            System.out.println("eligible");
        }
    }
}
class demo{
    void met(){
        license l = new license();
        try {
            l.input();//1
            l.verify();
        }catch(UndAge |OverAge e){
            try{
                l.input();//2
                l.verify();
            }catch(UndAge |OverAge e1){
                System.out.println("dont ever try again");
               System.exit(0);
            }
        }

    }
}
class WXCP3 {
    public static void main(String[] args) {
       demo d=new demo();
       d.met();
    }
}

