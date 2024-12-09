package threefinprac;
//strings
public class p6 {
    public static void main(String args[]) {
        /*
        String s1="roar";
        String s2=new String("roar");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        StringBuilder sb=new StringBuilder("roar");
        StringBuilder sb1=new StringBuilder("roar");

        System.out.println(sb);
        System.out.println(sb==sb1);
        System.out.println(sb.equals(sb1));
         */


         String q1="eesari";
         String q2="Eesari";
         String q3=" fg tht ";
        System.out.println(q1.charAt(5));
        System.out.println(q1.concat(" hello"));
        System.out.println(q1);



        System.out.println(q1.equals("eesari"));
        System.out.println(q1.equals(q2));
        System.out.println(q1.equalsIgnoreCase(q2));
        System.out.println(q1.equalsIgnoreCase("EEsari"));
        System.out.println(q1.substring(0));
        System.out.println(q1.substring(1,3));
        System.out.println(q1.length());
        System.out.println(q3.trim());
        System.out.println(q2.toLowerCase());
        System.out.println(q1.toUpperCase());
        System.out.println(q1.indexOf('e'));
        System.out.println(q2.indexOf("sari"));
         System.out.println(q1.lastIndexOf("e"));
        System.out.println(q1.lastIndexOf("ew"));
        System.out.println(q1.toString());


        /*
        String s=" ";
        System.out.println(s.isEmpty());
        System.out.println(s.equals(""));
         */
/*
      String s=" venkat ";
      int len=s.trim().length();
      System.out.println(len);

 */
        /*
      String fname="james";
      String gname="gosling";
      fname=gname;
      String st="gos";
      change(st);
      System.out.println(st);
    }
    private static void change(String str){
        str.concat("__morning");
    }

         */
        String s=new String("deav");
       // System.out.println(s.capacity());
/*
        StringBuilder sb=new StringBuilder();
        sb.append("sarve");
        System.out.println(sb.capacity());
        sb.ensureCapacity(32);
        System.out.println(sb.capacity());

        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(sb.charAt(3));
        System.out.println(sb);
        //sb.setCharAt(4,'jgfg');
        System.out.println(sb.append("jkhj"));
        System.out.println(sb.append(4));
        System.out.println(sb.append(4.5f));
        System.out.println(sb.append(3.1));
        System.out.println(sb.append('r'));
        System.out.println(sb.append("true"));
        System.out.println(sb.append(100005l));
        StringBuilder w=new StringBuilder("sonia");
        System.out.println(w.insert(2,'w'));
        System.out.println(w.insert(1,"aer"));
        System.out.println(w.insert(1,23));
        System.out.println(w.insert(2,3.4f));
        System.out.println(w.insert(5,5.6));
        System.out.println(w.insert(3,true));
        System.out.println(w.delete(2,4));
        System.out.println(w.deleteCharAt(5));
        System.out.println(w.reverse());

 */

        /*
        StringBuffer sr=new StringBuffer();
        System.out.println(sr.capacity());
        sr.ensureCapacity(21);
        System.out.println(sr.capacity());

         */
/*
        StringBuffer sp=new StringBuffer();
        sp.capacity();
        sp.ensureCapacity(12);
        System.out.println(sp.capacity());


 */
/*
        StringBuffer o=new StringBuffer("uiop");
        System.out.println(o.capacity());
        System.out.println(o.length());
        System.out.println(o.charAt(1));
         o.setCharAt(1,'q');
        System.out.println(o);
        System.out.println(o.append('e'));
        System.out.println(o.append("rtrt"));
        System.out.println(o.append(true));
        System.out.println(o.append(2.5f));
        System.out.println(o.insert(2,'w'));
        System.out.println(o.insert(2,1));
        System.out.println(o.insert(4,true));
        System.out.println(o.delete(1,5));
        System.out.println(o.deleteCharAt(3));
        System.out.println(o.reverse());

 */











    }
}
