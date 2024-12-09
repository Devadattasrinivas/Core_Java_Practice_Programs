package stringpack;
public class Stringbuf {
    public static void main(String args[]) {
        StringBuffer s = new StringBuffer();
        /*
        s.append("the");
        s.append(2.31);
        s.append(45);
        s.append('f');
        s.append(true);
        */
        s.append("the");
        s.append(2.3);
        s.append('s');
        s.append(5);
        s.append(true);//append will append only at after last index
        System.out.println(s);
       // s.append(3,"fgxg");;
        s.insert(2,"hgjvhj");//insert will insert the  data at particular index
        s.insert(3,"gt");
        System.out.println(s);
        s.insert(1,543);
        System.out.println(s);
        s.insert(s.length(),"dfhjfj");
        StringBuffer  s1=new StringBuffer("float");
        s1.insert(3,'h');
        s1.insert(4,'w');
        s1.insert(5," devadatta ");
        s1.delete(3,9);
        System.out.println(s1);
        s1.deleteCharAt(1);
        System.out.println(s1);
        s1.reverse();
        System.out.println(s1);
        s1.setLength(6);//only possible to delete at the last from setting length
        System.out.println(s1);

        StringBuffer s2=new StringBuffer(50);
        System.out.println(s2.capacity());
        s2.append("venkateshwara swamy");
        s2.trimToSize();//to make length and capacity equal
        System.out.println(s2.capacity());

        StringBuffer s3=new StringBuffer(67);
        System.out.println(s3.capacity());
        s3.append("sewrt");
        s3.trimToSize();
        System.out.println(s3.capacity());
        s3.ensureCapacity(45);
        System.out.println(s3.capacity());

        String Name="devadatta";
        String floaT=Name.toUpperCase();
        System.out.println(Name);
        System.out.println(floaT);
        //int Data=Name.length();
        //System.out.println(Data);

        // s2.ensureCapacity(1000);
       // System.out.println(s2.capacity());
        /*
        String name="sachin";
        String data=name.toUpperCase();
        int count=data.length();
        System.out.println(count);

         */
        //method chaining:when sll the return types are equal then only we have to perform(string-string //int-int)
       System.out.println(Name.toUpperCase().toLowerCase());
       StringBuffer e=new StringBuffer("sanivaralavratam");
       e.insert(4,"lakshmi").append("devi").reverse().insert(e.length(),"siva");
       System.out.println(e);
       

        




    }
}
