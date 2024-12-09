package serializatiopndesrialize;
import java.io.*;
//serialization w.r to inheritance
//if parent is serializable child is also serializable
//if object class implements serializable then no need to implement serializable  in other classes and doesnt get notserializableexcp
class Object implements Serializable{

}
class animal implements Serializable{//parent obj is serialised
    int i=10;
}
class era extends animal{
     int j=20;
}
public class class6 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
       // animal a=new animal();
        era e=new era();//during serialisation child obj is serialised
        String fn="animal.ser";
        System.out.println("serialisation started");
        FileOutputStream fos=new FileOutputStream(fn);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(e);
        System.out.println("serialisation ended");


        System.out.println("de-serialisation started");
        FileInputStream fis=new FileInputStream(fn);
        ObjectInputStream ois=new ObjectInputStream(fis);
        era e1=(era)ois.readObject();
        System.out.println(e.i+" "+e.j);
        System.out.println("de-serialisation ended");

    }
}
