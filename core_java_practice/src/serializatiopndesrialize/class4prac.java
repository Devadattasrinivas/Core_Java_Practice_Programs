package serializatiopndesrialize;

import java.io.*;
//object graph
class book implements  Serializable{
    pen p=new pen();
}
class pen implements Serializable{
    pencil f=new pencil();
}
class pencil implements  Serializable{
    int i=10;
}
public class class4prac {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        String fn="zera.ser";
        book b=new book();
        pen p=new pen();
        pencil f=new pencil();

        System.out.println("serialization started");
        FileOutputStream fos=new FileOutputStream(fn);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(b);
        System.out.println("serialization ended");

        System.out.println("de-serialization started");
        FileInputStream fis=new FileInputStream(fn);
        ObjectInputStream ois=new ObjectInputStream(fis);
        book b1=(book)ois.readObject();
        System.out.println(b1.p.f.i);
        System.out.println("de-serialization ended");

    }
}
