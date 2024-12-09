package serializatiopndesrialize;
import java.io.*;
//externalisation:programmer should say instead of jvm
//performance is high
//transient doesnt play a role in externalisation:becoz whatever fields we want we are using it by externalisation so no useof transient
//externalizable claass should compulsarily contains no arg-constr otherwise results in "InvalidClassException"
//class Demo implements Serializable{
//override readexternal() & writeExternal() of externalizable interface when implementing
class Demo implements Externalizable{
    transient String name;//paticipates in seriliza... when transient use externalization to mae it not participate
    int i;
    int j;
    public Demo(){
        System.out.println("demo zero-arg constru");
    }
    public Demo(String name,int i,int j){
        this.name=name;
        this.i=i;
        this.j=j;
    }
    //write the logic for selective serialisation
    public void writeExternal(ObjectOutput oos) throws IOException{
        System.out.println("writeexternal for externalisation");
         // variables need to participated write into animal.ser
        oos.writeObject(name);//only 2 fileds out of 3 has parucipated in externalisation i.e name ,i
        oos.writeInt(i);
    }
    //write the logic for selective de-serialisation
    public void readExternal(ObjectInput ois) throws IOException,ClassNotFoundException{
        System.out.println("readexternal for externalisation");
        // variables need to retrieved from animal.ser
        name=(String)ois.readObject();//first obj created using zero-arg constr and data copied from abc.ser file
        i=ois.readInt();
    }
}
public class class8 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Demo f=new Demo("era",56,78);

        String fn="animal.ser";
        System.out.println("seria lisation started");
        FileOutputStream fos=new FileOutputStream(fn);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(f);
        System.out.println("serialisation ended");

        System.in.read();
        System.out.println("de-serialisation started");
        FileInputStream fis=new FileInputStream(fn);
        ObjectInputStream ois=new ObjectInputStream(fis);
        Demo f1=(Demo) ois.readObject();//write either this or below one
       // ois.readObject();
        System.out.println(f1.name+" "+f1.i+" ");
        //System.out.println(f.name+" "+f.i+" ");
        System.out.println("de-serialisation ended");
    }
}
