package serializatiopndesrialize;
import java.io.*;
//object graph: all the objects in dog ,cat,rat are interlinked so all has to be serialized otherwise runtime exception
class horse implements Serializable{
    Cat3 c=new Cat3();
}
class  Cat3 implements Serializable{
    Rat r=new Rat();
}
class Rat implements Serializable{
    int i=10;
}

public class  class4 {
    public static void main(String[] args) throws Exception {

        String filename="abc.ser";
        horse d=new horse();
        System.out.println("serialization started");
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
        horse d1=(horse)oib.readObject();

        System.out.println(d1.c.r.i);//10//with serialization obj.inst var obj in dog class.inst var obj in cat obj.var

        System.out.println("de-serialization ended");
    }
}
