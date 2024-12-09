package ineuron;

public class thirtyonecodesnipp {
    /*
    instance so need to initialize
    String[] x;
    int[] a[] ={{1,2},{1}};
    Object c=new long[4];
    Object[]d=x;

     */
   /*
    int x = 5;

    */

    public static void main(String args[]) {
        /*
        int[][] a={{1,2,},{3,4}};
        int[] b=(int[]) a[1];
        Object o1=a;
        int[][] a2=(int[][])o1;
        System.out.println(b[1]);

         */
       /*
       String[] x={"yu","i"};//  localvar so default value should be given
        int[] a[] ={{1,2},{1}};
        Object c=new long[4];
        Object[]d=x;

        */


        /*
        int x=5;

        final thirtyonecodesnipp t1 = new thirtyonecodesnipp();
        thirtyonecodesnipp t2 = new thirtyonecodesnipp();
        thirtyonecodesnipp t3 = thirtyonecodesnippSwitch(t1, t2);
        System.out.println((t1==t3)+" "+(t1.x==t3.x));
        System.out.println(t1.x);//accesing insance var with obj
        System.out.println(t1);
        //System.out.println(x);
    }

    static thirtyonecodesnipp thirtyonecodesnippSwitch(thirtyonecodesnipp x, thirtyonecodesnipp y) {
        final thirtyonecodesnipp z = x;
        z.x = 6;
        return z;
    }
        */
     //   System.out.println("hello"+1+2);
        //System.out.println(1+2+"hello");
        String fruit="mango";
        switch(fruit) {
            default:
                System.out.println("default");
            case "mango":
                System.out.println("mango");//fallthrough from value found
            case "apple":
                System.out.println("apple");
                break;
            case "guava":
                System.out.println("guava");

        }

    }


}
