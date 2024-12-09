package serializatiopndesrialize;
//transient with final and static: transient  doesnt work herfe when used with these two
import java.io.*;
class Dog2 implements Serializable{//if this class not implements serializable then the obj not gets transportation ability
    static{
        System.out.println("static block gets created");
    }
    Dog2(){
        System.out.println("dog obj created");
    }
    //final and transient :final means var wont comes into picture ,it is directly the values
   // static and transient:var static is not a part of the obj state,so it is not a part of serialisation
   final  transient int i=10;//direct value participate in serialisation  not var so transient no use when used with final
   static  transient int j=20;//static var does not particpite in serialisation it will store in method area so tranient no use here
}

public class class3 {
    public static void main(String[] args) throws Exception {
        Dog2 d=new Dog2();
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
        Dog2 d1=(Dog2)oib.readObject();

        System.out.println("serialized  Dog obj is: "+d1.i+" "+d1.j);//10--20

        System.out.println("de-serialization ended");
    }
}
