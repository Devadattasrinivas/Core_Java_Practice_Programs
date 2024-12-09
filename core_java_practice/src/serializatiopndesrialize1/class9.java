package serializatiopndesrialize1;
import java.io.*;
class Sender implements Serializable{
    private static final long serialVersionUID=9L;//this var only in given in "serialVersionUID" otherwise if casessensitive treats as diff variable
    int i=9;//to make same uid for both serialisation and de-serialisation  when generated uid  by os and jdks and classfiles due to code weightage are diff
    int j=10;//if  used diff versions for serialization and de-serialisation then uid wil be diff
    int k=11;//if more no. of variables then class file will be different and uid willbe diff
}
public class class9 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        System.out.println("de-serialisation started");
        FileInputStream fis=new FileInputStream( "animal.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Sender r1=(Sender)ois.readObject();
        System.out.println(r1.i+" "+r1.j);
        System.out.println("de-serialisation ended");
    }
}