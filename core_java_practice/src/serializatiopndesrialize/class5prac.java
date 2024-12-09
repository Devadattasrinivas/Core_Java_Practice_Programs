package serializatiopndesrialize;
import java.io.*;
class Bank implements Serializable{
    String name="edbc";
    transient String password="rty45";
    transient int pin=222;

    //overriding writeobject and readobject to get transient var value without usng static and final
    private void writeObject(ObjectOutputStream oos) throws  IOException{
        oos.defaultWriteObject();
        String encrypt = 123 + password;
        int intencr = 1111 + 222;
        oos.writeObject(encrypt);
        oos.writeInt(intencr);
    }
    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
      ois.defaultReadObject();
      String encrypt=(String)ois.readObject();
      password=encrypt.substring(3);
      int intencr =(int)ois.readInt();
      pin = intencr - 1111;
    }
}
public class class5prac {
    public static void main(String[] args)throws Exception {
        Bank b=new Bank();
        String fn="zer.ser";
        System.out.println("serial... started");
        FileOutputStream fos=new FileOutputStream(fn);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(b);
        System.out.println("serial... ended");

        System.out.println("de-seri..  started");
        FileInputStream fis=new FileInputStream(fn);
        ObjectInputStream ois=new ObjectInputStream(fis);
        Bank b1=(Bank)ois.readObject();
        System.out.println(b1.name+" "+b1.password +" "+b1.pin);
        System.out.println("de-ser... ended");
    }
}
