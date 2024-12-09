package serializatiopndesrialize;
import java.io.*;
//serialisation:taken care by jvm,prefer when we want to save full code
//performance is low becoz whole object serialization possible, required part serialisation cant  serialise
class Animal1{
    int i=10;
   // Animal1(int i){
    Animal1(){//zero-arg constr called by jvm during de-serilisation if no zero-arg const then results in exception
        System.out.println("animal constr");
    }
}
class fog  extends Animal1 implements Serializable{
    int j=20;
    fog(){
      // super(10);//parent class constr
        System.out.println("fog constr");
    }
}
public class class7 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        fog f=new fog();//during serialisation child obj is serialised
        f.i=888;//10
        f.j=999;//999
        String fn="animal.ser";
        System.out.println("serialisation started");
        FileOutputStream fos=new FileOutputStream(fn);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(f);
        System.out.println("serialisation ended");

          System.in.read();
        System.out.println("de-serialisation started");
        FileInputStream fis=new FileInputStream(fn);
        ObjectInputStream ois=new ObjectInputStream(fis);
        fog f1=(fog)ois.readObject();
        System.out.println(f1.i+" "+f1.j);
        System.out.println("de-serialisation ended");

    }
}
