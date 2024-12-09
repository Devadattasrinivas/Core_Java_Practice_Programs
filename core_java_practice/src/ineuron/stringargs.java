package ineuron;

public class stringargs {
    public static void main(String args[]){
        int String=10;//predefined classnames can be used as identifiers
        String Runnable="Sachin";
        int Round=2;//predefined class
        int If=9;
        byte b=127;
        System.out.println(b);
        System.out.println("byte:"+Byte.SIZE);
        System.out.println("byte:"+Byte.MAX_VALUE);
        System.out.println("byte:"+Byte.MIN_VALUE);
        Short s=137;
        System.out.println("Short"+Short.SIZE);
        System.out.println("Short:"+Short.MIN_VALUE);
        System.out.println("Short:"+Short.MAX_VALUE);
        int i=138;
        System.out.println("int:"+Integer.SIZE);
        System.out.println("int:"+Integer.MIN_VALUE);
        System.out.println("int"+Integer.MAX_VALUE);
        Long l=2147483647l;
        Long t=10L;
        System.out.println(l);
        System.out.println(t);
        Float f=4.5f;
        System.out.println("float:"+Float.SIZE);
        System.out.println("float:"+Float.MIN_VALUE);
        System.out.println("float:"+Float.MAX_VALUE);
        Double d=3.4;
        System.out.println("Double:"+Double.SIZE);
        System.out.println("Double:"+Double.MIN_VALUE);
        System.out.println("Double:"+Double.MAX_VALUE);

        System.out.println(args[2]);
        System.out.println(args[1]);
        System.out.println(String);
        System.out.println(Runnable);
        System.out.println(Round);
        System.out.println(If);
        int g=25;
        int h=2;
        float iy=g/h;
        System.out.println(iy);
        int w=45;
        double v;
        v=w;
        System.out.println(w);
        //typecasting but loss of precision
        double n=45.5;
        int y;
        y=(byte)n;
        System.out.println(y);
        byte ab=10;
        byte bc=20;
        int cd=ab*bc;
        System.out.println(cd);
        double fri=45.5;
        byte bri;
        bri=(byte)fri;
        System.out.println(bri);


    }
}
