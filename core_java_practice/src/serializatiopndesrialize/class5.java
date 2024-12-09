package serializatiopndesrialize;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.*;
//object graph: all the objects in dog ,cat,rat are interlinked so all has to be serialized otherwise runtime exception
class Account implements Serializable{
   String username="era";
   transient String password="we45";//transient -loss of information user want use custom sei and desr...
   //we can get password value even marked as transient by using statiic and final but without using these using custom serialisation we cn achieve
   //custom serialization for getting password value:overriding the default serialisation process to encrypt the password during seriali.. and decrypt during de-seriali...
  transient int pin=444;

   private void writeObject(ObjectOutputStream oos)throws IOException{
     System.out.println("write obj method is called");

     //perform default serialization
     oos.defaultWriteObject();

     //perform encryption on password
     String encrypted= "123" +password;//123we45
     int encrypin=1111+pin;//1555

     //write the encrypted data as object to serialized file
     oos.writeObject(encrypted);
     oos.writeInt(encrypin);
   }
   //custom de-serialisation fails when protected keyword used,becoz protected and transient  makes complex interaction
    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        System.out.println("read obj method is called");

        //perform default de-serialisation
        ois.defaultReadObject();

        //read encrypted data from serialized file
        String encrypted=(String)ois.readObject();//typecasting obj to string
        int encrypin=(int)ois.readInt();

        //perform decryption and attach it to instance variable
        password=encrypted.substring(3);//we45
        pin=encrypin-1111;//444
    }

}

public class  class5 {
    public static void main(String[] args) throws Exception {
       Account acc=new Account();
        System.out.println("serialization started");
        String filename="der.ser";
        FileOutputStream fos=new FileOutputStream(filename);
        ObjectOutputStream oob=new ObjectOutputStream(fos);
        oob.writeObject(acc);
        System.out.println("serialized obj ref:: "+acc);

        System.out.println("open abc.ser in javaprograms file to see output which is not in human readable format can be understand by jvm ");
        System.out.println("serialization ended");

        //to pause the execution for sometime until we press some key from keyboard
        System.in.read();

        //in de-seria... we are getting obj state back from a file
        System.out.println("de-serialization started");
        FileInputStream fis=new FileInputStream(filename);
        ObjectInputStream oib=new ObjectInputStream(fis);
        Account acc1=(Account)oib.readObject();

        System.out.println(acc1.username);//10//with serialization obj.inst var obj in dog class.inst var obj in cat obj.var
        System.out.println(acc1.password);
        System.out.println(acc1.pin);

        System.out.println("de-serialization ended");
    }
}