package finalprac;

public class stringbb {
    public static void main(String args[]){
        /*
        //string
        //content is  fixed

        String s1="devadatta";
        String s2=new String("devadatta");
        String s3=new String(" DEVA DATTA ");


        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));



        System.out.println(s2.charAt(3));
        System.out.println(s2.concat(" chikati"));
        System.out.println(s2.equals("devadatta"));
        System.out.println(s2.equals(s1));
        System.out.println(s2.equalsIgnoreCase("DEVADATTA"));
        System.out.println(s2.equalsIgnoreCase(s3));
        System.out.println(s2.toUpperCase());
        System.out.println(s3.toLowerCase());
        System.out.println(s2.substring(4));
        System.out.println(s2.substring(4,7));
        System.out.println(s3.trim());
        System.out.println(s2.length());
        System.out.println(s2.replace('d','t'));
        System.out.println(s2.toString());
        System.out.println(s2.indexOf('t'));
        System.out.println(s2.lastIndexOf('t'));
/*

 */
        /*StringBuilder

         //content changes frequenly no thradsafety good perf

        //StringBuilder(worried abt performance ,all threads no need to be in wait state(no thread safety))moslty used string builder

        StringBuilder b=new StringBuilder(4);
        StringBuilder b1=new StringBuilder("devadatta");
        StringBuilder b2=new StringBuilder("iop");
        System.out.println(b.capacity());
        System.out.println(b.length());
        b.ensureCapacity(34);//void
        System.out.println(b.capacity());
        System.out.println(b1.charAt(1));
        b1.setCharAt(7,'h');//void
        System.out.println(b1);
        System.out.println(b1.append(" chikati"));
        System.out.println(b1.append('g'));
        System.out.println(b1.append(6));
        System.out.println(b1.append(6.3f));
        System.out.println(b1.append(9.2));
        System.out.println(b1.append(6l));
        System.out.println(b2.insert(1,"deva"));
        System.out.println(b2.insert(2,'r'));
        System.out.println(b2.insert(2,2));
        System.out.println(b2.deleteCharAt(2));
        System.out.println(b2.delete(3,5));//-1
        System.out.println(b2.reverse());
        /*

          */
             //Stringbuffer

        //content changes frequenly ,thread safety low perf than stingbuilder
        //Stringbuffer worried abt safety ,all threads  need to be in wait state (thread safety)performance slow
        StringBuffer s1=new StringBuffer("devadatta");
        StringBuffer s=new StringBuffer(5);
        System.out.println(s.capacity());
        s.ensureCapacity(56);//void
        System.out.println(s.capacity());
        System.out.println(s1.capacity());
        System.out.println(s1.length());
        System.out.println(s1.append(" chikati"));//appended at last
        System.out.println(s1.append('y'));
        System.out.println(s1.append(9));
        System.out.println(s1.append(6.4f));
        System.out.println(s1.insert(1,"era"));
        System.out.println(s1.insert(2,'t'));
        System.out.println(s1.insert(3,6));
        System.out.println(s1.deleteCharAt(0));
        System.out.println(s1.delete(1,2));
        System.out.println(s1.reverse());


    }
}
