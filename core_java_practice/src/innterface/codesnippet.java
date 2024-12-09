package innterface;

public class codesnippet {
    boolean[] b=new boolean[2];//boolean array with default null value
    public static void main(String args[]){
      //  String s1="null"+null+1;//string+object
      //  System.out.println(s1);

       // String s1=1+null+"null";//primitive+ref type not possible with binary operator
     //   System.out.println(s1);

       // String s1="sachin tendulkar";
        //System.out.println(s1.indexOf('s')+s1.indexOf("tendulkar"));

        //String s1=null;//null obj
        //System.out.println(s1.toUpperCase());//operation on null object

      //  String[] str={"java","hibernate","spring"};
       // String lang=String.join("_",str);//making array into a string
       // System.out.println(lang);

        /*
        String str="java";
        StringBuffer s1=new StringBuffer(str);
        StringBuilder s2=new StringBuilder(str);
        System.out.println(str.equals(s1));//string operations can be performed between two strings
         System.out.println(s1.equals(s2));//compares references both referemces same

         */

        // System.out.println(lang);
       // codesnippet c=new codesnippet();
       // System.out.println(c.b[0]+" "+c.b[1]);
        Integer x=100;//wrapper classes and string class immutable ,change done on new copy
        Integer y=200;
        x++;//101
        StringBuilder s=new StringBuilder("123");//mutable classes ,cchange made on existing copy
        StringBuilder s1=s;
        s.append("5");
        System.out.println((x==y)+" "+(s==s1));//101==200

    }
}
