package serializatiopndesrialize;
//transient variable:jvm dont save the value and set defaults value by overriding original value  to var
import java.io.*;
class Dog1 implements Serializable{//if this class not implements serializable then the obj not gets transportation ability
    static{
        System.out.println("static block gets created");
    }
    Dog1(){
        System.out.println("dog obj created");
    }
    transient int i=10;//transient -if we  dont want want that variable to participate in serialization
    int j=20;
}

public class class2 {
    public static void main(String[] args) throws Exception {
        Dog1 d=new Dog1();
        System.out.println("serialization started");
        String filename="abc.ser";
        FileOutputStream fos=new FileOutputStream(filename);
        ObjectOutputStream oob=new ObjectOutputStream(fos);
        oob.writeObject(d);
        System.out.println("serialized obj ref:: "+d);

        System.out.println("open abc.ser in javaprograms file to see output which is not in human readable format can be understand by jvm ");
        System.out.println("serialization ended");

        System.in.read();

        //in de-seria... we are getting obj state back from a file
        System.out.println("de-serialization started");
        FileInputStream fis=new FileInputStream(filename);
        ObjectInputStream oib=new ObjectInputStream(fis);
        Dog1 d1=(Dog1)oib.readObject();

        System.out.println("serialized  Dog obj is: "+d1.i+" "+d1.j);//0--20

        System.out.println("de-serialization ended");
    }
}
