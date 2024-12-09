package stringpack;

public class Stringbuffinal{
    public static void main(String args[]){
        StringBuffer f=new StringBuffer();
        f.append("sya");
        System.out.println(f);
        f.insert(1,"ataa");
        System.out.println(f);
        f.replace(3,5,"uri");
        System.out.println(f);
        f.delete(6,7);
        System.out.println(f);
        System.out.println(f.substring(3,7));
        System.out.println(f.reverse());
        System.out.println(f.capacity());
        System.out.println(f.length());

        StringBuffer f1=new StringBuffer();
        f1.append("deva");
        System.out.println(f1.capacity());

        StringBuffer f2=new StringBuffer(5);
        f2.append("devad");
        System.out.println(f2.capacity());//5
        f2.append("atta");//5+" "(1)=6*2=12
        System.out.println(f2.capacity());//
        f2.append("chikati    ");//12+1=13*2=26
        System.out.println(f2.capacity());
        System.out.println(f2.charAt(3));
        System.out.println(f2.deleteCharAt(3));
        f2.setCharAt(3,'a');
        System.out.println(f2);
        System.out.println(f2.capacity());
        f2.ensureCapacity(200);
        System.out.println(f2.capacity());







    }
}
