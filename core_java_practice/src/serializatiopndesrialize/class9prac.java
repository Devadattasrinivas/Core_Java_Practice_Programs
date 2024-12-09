package serializatiopndesrialize;
import java.io.*;
//execute serialisation class and deserialisation class from diff version jdks or code with unequal variables
class dender implements Serializable{
    private static final long serialVersionUID=7L;
    int i=3;
    int j=7;
    int k=6;
}
public class class9prac {
    public static void main(String[] args)throws IOException,ClassNotFoundException {
        dender d=new dender();

        System.out.println("serilisation started");
        FileOutputStream fos=new FileOutputStream("ani.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(d);
        System.out.println("serilisation ended");


    }
}
