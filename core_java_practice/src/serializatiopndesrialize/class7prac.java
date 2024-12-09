package serializatiopndesrialize;
import java.io.*;

class Pare {
    int i=12;
}
class chil extends Pare implements Serializable{
    int j=13;
}
public class class7prac {
    public static void main(String[] args)throws IOException,ClassNotFoundException{
        chil c=new chil();
        String fn="ani.ser";
        System.out.println("serialisation started");
        FileOutputStream fos=new FileOutputStream(fn);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(c);
        System.out.println("serialisation ended");

        System.out.println("de-serialisation started");
        FileInputStream fis=new FileInputStream(fn);
        ObjectInputStream ois=new ObjectInputStream(fis);
        chil c1=(chil)ois.readObject();
        System.out.println(c1.i+" "+c1.j);
        System.out.println("de-serialisation ended");



    }
}
