package finalprac;

public class string {
    public static void main(String args[]) {
        /*1

        String s = "omsakti";
        String s1 = new String("omsakti");
        s.concat("eesari");
        s1.concat("eesari");
        System.out.println(s);
                    System.out.println(s1);
        System.out.println(s == s1);
        System.out.println(s1.equals(s));



         */
        StringBuilder s3 = new StringBuilder("ratrisakti");
        StringBuilder s4 = new StringBuilder("ratrisakti");
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
/*
        String str = " ";
        str.trim();
        System.out.println(str.equals("") + " " + str.isEmpty());

        String st = "dev foar";
        int len = st.trim().length();
        System.out.println(len);
        String j = "Java";
        String g = new String("java");
        System.out.println(j.toLowerCase() == g.toLowerCase());
        j = g;
        System.out.println(j);
        System.out.println(g);
        System.out.println(j.equalsIgnoreCase(g));
/*
        String fname = "gosling";
        String gname = "fight";
        System.out.println(fname = gname);

        String str1 = "road";
        change(str1);
        System.out.println(str1);

     */
/*
    }
    private static void change(String s1){
        s1.concat("__morning");
    }

 */
        /*
        final String fname="james";//(scp)compiler will know the value of var and used in the exp when var declared final
        String lname="gosling";// value of var not known to compiler  only jvm
        String name1=fname+lname;//final+var(jvm)==>heap if jvm memory in heap area,compiler then mem is scp
        String name2=fname+"gosling";//final+direct literal(compiler)==>scp
        String name3="james"+"gosling";//(direct literals)compiler==>scp
        System.out.println(name1==name2);
        System.out.println(name2==name3);
        /*



    */

        /*
        String n="saktii";
        String f=" SAKTI" ;
        System.out.println(n.charAt(2));
        System.out.println(n.concat(" hello"));
        System.out.println(n.equals("sakti"));
        System.out.println(n.equalsIgnoreCase(f));
        System.out.println(n.charAt(2));
        System.out.println(n.substring(2));
        System.out.println(n.substring(2,4));
        System.out.println(n.length());
        System.out.println(n.replace('i','r'));
        System.out.println(f.toLowerCase());
        System.out.println(n.toUpperCase());
        System.out.println(f.trim());
        System.out.println(n.indexOf('i'));
        System.out.println(n.lastIndexOf('i'));
        System.out.println(n.toString());



        //stringbuilder
       // StringBuilder s=new StringBuilder();
      //  s.append("om");
      //  s.replace(0,1,"raita");
       // System.out.println(s);
        s.append("you").insert(2,"toi");
        System.out.println(s);
/*
        System.out.println(s.length());
        System.out.println(s.capacity());
        System.out.println(s.charAt(4));
        StringBuilder z=new StringBuilder();
        System.out.println(z.length());
        System.out.println(z.capacity());
        StringBuilder z1=new StringBuilder("sachin");
        System.out.println(z1.capacity());
        z1.append("dfwryutjhjyhyudghjkxaassfrrr");
        System.out.println(z1.capacity());
        System.out.println(z1.charAt(4));
         z1.setCharAt(4,'o');
        System.out.println(z1);
        StringBuilder z2=new StringBuilder(1);
        System.out.println(z2.append('r'));
        System.out.println(z2.append(20));
        System.out.println(z2.append(20.f));
        System.out.println(z2.append(true));
        System.out.println(z2.append(false));
        System.out.println(z2.insert(2,"tyu"));
        System.out.println(z2.insert(2,5));
        System.out.println(z2.insert(2,true));
        System.out.println(z2.insert(3,"goat"));
        System.out.println(z2.delete(3,15));//-1
        System.out.println(z2.deleteCharAt(3));
        System.out.println(z2.reverse( ));/*



/*
        StringBuffer z3=new StringBuffer();
        System.out.println(z3.capacity( ));
        z3.ensureCapacity(29);
        System.out.println(z3.capacity( ));

 */


    }

}
