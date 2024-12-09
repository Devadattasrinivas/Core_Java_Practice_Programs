package serializatiopndesrialize;
import java.io.*;
//serializable using inheritance
class parent implements Serializable{
    int i=10;
   parent(){
       System.out.println("parent constr");
   }
}
class child extends parent{
    int j=11;
    child(){
        System.out.println("child constr");
    }
}
public class class6prac {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
      String fn="child.ser";
      child p=new child();
      System.out.println("serialisation started");
      FileOutputStream fos=new FileOutputStream(fn);
      ObjectOutputStream oos=new ObjectOutputStream(fos);
      oos.writeObject(p);
      System.out.println("serialisation ended");

      System.out.println("de-serialisation started");
      FileInputStream fis=new FileInputStream(fn);
      ObjectInputStream ois=new ObjectInputStream(fis);
      child c=(child) ois.readObject();
      System.out.println(p.i+" "+p.j);
      System.out.println("de-serialisation ended");


    }
}
