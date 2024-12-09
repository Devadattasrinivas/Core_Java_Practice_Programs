package serializatiopndesrialize;
import java.io.*;
import java.util.*;
//override writeobjects,readobject methods in the form of  writeExternal,readExternal
class car1 implements Externalizable{
    int i;//=2;
    int j;
    String name;
    public car1(){
        System.out.println("car no-arg constr");
    }
    public car1(int i,int j,String name){
        this.i=i;
        this.j=j;
        this.name=name;
    }
   public void writeExternal(ObjectOutput oos)throws IOException{
       System.out.println("writeexternal for externalisation");
       oos.writeInt(i);
       oos.writeInt(j);
       oos.writeObject(name);

   }
   public void readExternal(ObjectInput ois)throws IOException,ClassNotFoundException{
       System.out.println("readexternal for externalisation");
       i=ois.readInt();
       j=ois.readInt();
       name=(String)ois.readObject();
   }
}
public class class8prac {
    public static void main(String[] args)throws IOException,ClassNotFoundException {
        car1 c=new car1(1,4,"reka");
        String fn="ani.ser";
        System.out.println("serialisation started");
        FileOutputStream fos=new FileOutputStream(fn);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(fn);
        System.out.println("serialisation ended");
        System.in.read();

        System.out.println("de-serialisation started");
        FileInputStream fis=new FileInputStream(fn);
        ObjectInputStream ois=new ObjectInputStream(fis);
       // car1 c1=(car1)
                ois.readObject();
        System.out.println(c.i+" "+c.j+" "+c.name);
        System.out.println("de-serialisation ended");
    }
}
