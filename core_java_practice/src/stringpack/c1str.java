package stringpack;

public class c1str {
    public static void main(String args[]) {
        /*
        String str=" ";//immutable
        str.trim();//new obj created not on  old obj so no impact
        System.out.println(str.equals("")+" "+str.isEmpty());

        String s="sachin tendulkar";
        int len=s.trim().length();
        System.out.println(len);

         */
        /*
        String s="hello world";
        s.trim();
        int i=s.indexOf(" ");
        System.out.println(i);

        String str1="Java";
        String str2=new String("java");
       // str1=str2;
      //  str1.toLowerCase()==str2.toLowerCase() (== rref compared)
        String str3=str2;
        if(str3.equalsIgnoreCase(str2)){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }

         */
        /*

        System.out.print("==");
        System.out.print(" ");
        System.out.print("A"=="A");
        System.out.print("a==A");

        String fname="james";
        String iname="goslimg";
        System.out.println(fname=iname);
        */
/*
         String str="good";
         change(str);
         System.out.println(str);
    }

         private static void change(String s1) {
             s1.concat("__morning");
         }
*/

           final String fname="james";//(scp)compiler will know the value of var and used in the exp when var declared final
           String lname="gosling";// value of var not known to compiler  only jvm
           String name1=fname+lname;//final+var(jvm)==>heap if jvm memory in heap area,compiler then mem is scp
           String name2=fname+"gosling";//final+direct literal(compiler)==>scp
           String name3="james"+"gosling";//(direct literals)compiler==>scp
           System.out.println(name1==name2);
           System.out.println(name2==name3);

    }
}
