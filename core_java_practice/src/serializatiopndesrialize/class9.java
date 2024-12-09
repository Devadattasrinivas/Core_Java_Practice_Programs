package serializatiopndesrialize;
//sender:serialisation
import java.io.*;
class Sender implements Serializable{
    private static final long serialVersionUID=9L;//to make same uid for both serialisation and de-serialisation  when generated uid  by os and jdks and classfiles due to code weightage are diff
    int i=9;
    int j=10;//if  used diff versions for serialization and de-serialisation then uid wil be diff
   //if more no. of variables then class file will be different and uid willbe diff
}
public class class9 {
    public static void main(String[] args) throws IOException {
        Sender s=new Sender();
        String fn="animal.ser";
        System.out.println("serialisation started");
        FileOutputStream fos=new FileOutputStream(fn);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(s);
        System.out.println("serialisation ended");
    }
}
