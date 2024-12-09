package serializatiopndesrialize;
import java.io.*;
class dender1 implements Serializable {
    private static final long serialVersionUID=7L;
    int i=3;
    int j=7;
    int k=6;
}
public class class10prac {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        System.out.println("de-serilisation started");
        FileInputStream fis = new FileInputStream("ani.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        dender d1 = (dender) ois.readObject();
        System.out.println(d1.i + " " + d1.j);
        System.out.println("de-serilisation ended");
    }
}
