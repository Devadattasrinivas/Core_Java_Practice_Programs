package serializatiopndesrialize;
import java.io.*;
//serializable and de-serializable
class Dog implements Serializable{//if this class not implements serializable then the obj not gets transportation ability
   static{
       System.out.println("static block gets created");
   }
   Dog(){
   System.out.println("dog obj created");
   }
    int i=10;
    int j=20;
}
class Cat implements Serializable{
    static{
        System.out.println("static block gets executed");
    }
    Cat(){
        System.out.println("cat obj created");
    }
    int i=100;
    int j=200;
}
public class class1 {
    public static void main(String[] args) throws Exception {
        Dog d=new Dog();
        Cat c= new Cat();
        //in serial.. we are sending the obj into the file
        System.out.println("serialization started");
        String filename="abc.ser";
        FileOutputStream fos=new FileOutputStream(filename);
        ObjectOutputStream oob=new ObjectOutputStream(fos);
        oob.writeObject(d);
        oob.writeObject(c);
        System.out.println("serialized obj ref:: "+d);

        System.out.println("open abc.ser in javaprograms file to see output which is not in human readable format can be understand by jvm ");
        System.out.println("serialization ended");

        System.in.read();

 //in de-seria... we are getting obj state back from a file
        System.out.println("de-serialization started");
        FileInputStream fis=new FileInputStream(filename);
        ObjectInputStream oib=new ObjectInputStream(fis);
        Dog d1=(Dog)oib.readObject();//creation of obj is done not with readobj  unlike with constru like in serialisation
        //returntype obj//when returning the obj,creation of obj should happen and constr should execute but here constr not executed why? becoz it is not creating new obj getting back already created obj so const not excuted
        Cat c1=(Cat)oib.readObject();


        //Cat c1=(Cat)oib.readObject();//in which order serialized obj created in that  order should  be read in de-serialization otherwise results in error
        // Dog d1=(Dog)oib.readObject();

        System.out.println("serialized  Dog obj is: "+d1.i+" "+d1.j);//using readobj this constr created
       // Dog s=(Dog)o;//typecasting to dog type//even if you delete dog class generated file also no problem becoz already copy there in method area
        System.out.println("serialized   obj is: "+c1.i+" "+c1.j);

        System.out.println("de-serialization ended");
        //both objs are not same deserialization obj created with 0 arg constru..,but state of the obj is same(state of the obj: data in the instance variable)
    }
}
